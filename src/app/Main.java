package app;

import gui.AppMainFrame;

public class Main {
    public static void main( String[] args) {
    	// 设置环境变量
        String serverURL = "jdbc:sqlserver://localhost:1433";
        String databaseName = "master";
        String user = "sa";
        String password = "Spy-12345";

        new AppMainFrame(serverURL, databaseName, user, password);
    }

}
