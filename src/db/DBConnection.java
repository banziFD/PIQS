package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class DBConnection {
    private Connection connection;
    private String connectionURL;
    public DBConnection(String serverURL, String databaseName, String user, String password) {
        this.connectionURL = String.format("%s;databaseName=%s;user=%s;password=%s", serverURL, databaseName, user, password);
        System.out.println(String.format("%s: %s", "connectionURL", this.connectionURL));
        try {
            System.out.println("Connecting to SQL Server ...");
            this.connection = DriverManager.getConnection(connectionURL);
            System.out.println("Success connecting server");
            this.demoData();
        } catch (Exception e) {
            System.out.println("Error in creating connection to SQL Server");
            e.printStackTrace();
        }

    }

   public void demoData() {
       try {
           // Load SQL Server JDBC driver and establish connection.
           System.out.print("Connecting to SQL Server ... ");
           try (Connection connection = DriverManager.getConnection(this.connectionURL)) {
               System.out.println("Done.");

               // Create a sample database
               System.out.print("Dropping and creating database 'SampleDB' ... ");
               String sql = "DROP DATABASE IF EXISTS [SampleDB]; CREATE DATABASE [SampleDB]";
               try (Statement statement = connection.createStatement()) {
                   statement.executeUpdate(sql);
                   System.out.println("Done.");
               }

               // Create a Table and insert some sample data
               System.out.print("Creating sample table with data, press ENTER to continue...");
               System.in.read();
               sql = new StringBuilder().append("USE SampleDB; ").append("CREATE TABLE Employees ( ")
                       .append(" Id INT IDENTITY(1,1) NOT NULL PRIMARY KEY, ").append(" Name NVARCHAR(50), ")
                       .append(" Location NVARCHAR(50) ").append("); ")
                       .append("INSERT INTO Employees (Name, Location) VALUES ").append("(N'Jared', N'Australia'), ")
                       .append("(N'Nikita', N'India'), ").append("(N'Tom', N'Germany'); ").toString();
               try (Statement statement = connection.createStatement()) {
                   statement.executeUpdate(sql);
                   System.out.println("Done.");
               }

               // INSERT demo
               System.out.print("Inserting a new row into table, press ENTER to continue...");
               System.in.read();
               sql = new StringBuilder().append("INSERT Employees (Name, Location) ").append("VALUES (?, ?);")
                       .toString();
               try (PreparedStatement statement = connection.prepareStatement(sql)) {
                   statement.setString(1, "Jake");
                   statement.setString(2, "United States");
                   int rowsAffected = statement.executeUpdate();
                   System.out.println(rowsAffected + " row(s) inserted");
               }

               // UPDATE demo
               String userToUpdate = "Nikita";
               System.out.print("Updating 'Location' for user '" + userToUpdate + "', press ENTER to continue...");
               System.in.read();
               sql = "UPDATE Employees SET Location = N'United States' WHERE Name = ?";
               try (PreparedStatement statement = connection.prepareStatement(sql)) {
                   statement.setString(1, userToUpdate);
                   int rowsAffected = statement.executeUpdate();
                   System.out.println(rowsAffected + " row(s) updated");
               }

               // DELETE demo
               String userToDelete = "Jared";
               System.out.print("Deleting user '" + userToDelete + "', press ENTER to continue...");
               System.in.read();
               sql = "DELETE FROM Employees WHERE Name = ?;";
               try (PreparedStatement statement = connection.prepareStatement(sql)) {
                   statement.setString(1, userToDelete);
                   int rowsAffected = statement.executeUpdate();
                   System.out.println(rowsAffected + " row(s) deleted");
               }

               // READ demo
               System.out.print("Reading data from table, press ENTER to continue...");
               System.in.read();
               sql = "SELECT Id, Name, Location FROM Employees;";
               try (Statement statement = connection.createStatement();
                    ResultSet resultSet = statement.executeQuery(sql)) {
                   while (resultSet.next()) {
                       System.out.println(
                               resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
                   }
               }
               connection.close();
               System.out.println("All done.");
           }
       } catch (Exception e) {
           System.out.println();
           e.printStackTrace();
       }
   }

}
