package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProinfTable {
    private String connectionURL;
    private Connection connection;

    public static void main(String[] args) {
        ProinfTable proinfTable = new ProinfTable("jdbc:sqlserver://localhost:1433", "piqs", "stu", "123456");
        // System.out.println(proinfTable.showAll());
        // System.out.println(proinfTable.showProduct());
        proinfTable.showAll();
        proinfTable.showProduct("203502");
        proinfTable.add("100101");
        proinfTable.reduce("100102");
        proinfTable.delete("304025");
    }

    public ProinfTable(String serverURL, String databaseName, String user, String password) {
        this.connectionURL = String.format("%s;databaseName=%s;user=%s;password=%s", serverURL, databaseName, user,
                password);
        System.out.println(String.format("%s: %s", "connectionURL", this.connectionURL));
        try {
            System.out.println("Connecting to SQL Server ...");
            this.connection = DriverManager.getConnection(connectionURL);
            System.out.println("Success connecting server");
        } catch (SQLException e) {
            System.out.println("Error in creating connection to SQL Server");
            e.printStackTrace();
        }
    }

    public Product[] showAll() {
        Product[] result = new Product[7];
        String sql = String.format("SELECT * FROM proinftable;");
        System.out.println(String.format("sql query: %s", sql));

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            int i = 0;
            while (resultSet.next() && i < 7) {
                System.out.print(resultSet.getString(1));
                System.out.print(resultSet.getString(2));
                System.out.print(resultSet.getString(3));
                System.out.print(resultSet.getString(4));
                result[i] = new Product(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3),
                        resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getString(7),
                        resultSet.getString(8), resultSet.getString(9), resultSet.getString(10),
                        resultSet.getString(11));
                System.out.println();
                i++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public Product showProduct(String prdno) {
        String sql = "SELECT * FROM proinftable WHERE PRDNO=" + prdno + ";";
        System.out.println(sql);
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.next()) {
                System.out.println(resultSet.getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void add(String prdno) {
        String sql = "UPDATE proinftable" + " SET PRDRT=PRDRT+1" + " WHERE PRDNO=" + prdno + ";";
        System.out.println(sql);
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void reduce(String prdno) {
        String sql = "UPDATE proinftable" + " SET PRDRT=PRDRT-1" + " WHERE PRDNO=" + prdno + ";";
        System.out.println(sql);
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(String prdno) {
        String sql = "DELETE  FROM proinftable WHERE PRDNO=" + prdno + ";";
        System.out.println(sql);
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
