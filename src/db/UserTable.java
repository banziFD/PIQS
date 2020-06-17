package db;

import java.sql.Connection;

public class UserTable {
    private String connectionURL;
    private Connection connection;

    public UserTable(String serverURL, String databaseName, String user, String password) {
        this.connectionURL = String.format("%s;databaseName=%s;user=%s;password=%s", serverURL, databaseName, user,
                password);
        System.out.println(String.format("%s: %s", "connectionURL", this.connectionURL));
    //    try {
    //        System.out.println("Connecting to SQL Server ...");
    //        this.connection = DriverManager.getConnection(connectionURL);
    //        System.out.println("Success connecting server");
    //    } catch (SQLException e) {
    //        System.out.println("Error in creating connection to SQL Server");
    //        e.printStackTrace();
    //    }
    }

    // public boolean login(String account, String password) {
    //     String sql = String.format("SELECT * FROM usertable WHERE USACT='%s',USPSW='%s';", account, password);
    //     System.out.println(String.format("sql query: %s", sql));
    //     boolean verify = false;
    //     try {
    //         Statement statement = connection.createStatement();
    //         ResultSet resultSet = statement.executeQuery(sql);
    //         if (resultSet.next()) {
    //             verify = true;
    //         }
    //     } catch (SQLException e) {
    //         e.printStackTrace();
    //     }
    //     return verify;
    // }

    public boolean login(String account, String password) {
        return account.equals(password);
    }

    // public String getUserType(String account) {
    //     String sql = String.format("SELECT USCL FROM userTable WHERE USACT='%s'", account);
    //     System.out.println(String.format("sql query: %s", sql));
    //     String type = "";
    //     try {
    //         Statement statement = connection.createStatement();
    //         ResultSet resultSet = statement.executeQuery(sql);
    //         if (resultSet.next()) {
    //             type = resultSet.getString(1);
    //         }
    //     } catch (SQLException e) {
    //         e.printStackTrace();
    //     }
    //     return type;
    // }

    public String getUserType(String account) {
        return "customer";
    }

}
