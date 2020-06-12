package app;

import db.DBConnection;

public class Main {
    public static void main( String[] args ) {
    	// 设置环境变量
        String serverURL = "jdbc:sqlserver://localhost:1433";
        String databaseName = "master";
        String user = "sa";
        String password = "Aa-12345";
        
        
        
        DBConnection dbConnection = new DBConnection(serverURL, databaseName, user, password);
    }
}
