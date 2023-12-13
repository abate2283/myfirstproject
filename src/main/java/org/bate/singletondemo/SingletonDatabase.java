package org.bate.singletondemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonDatabase {
    private static final String URL = "jdbc:mysql://localhost:3306/clientDb?serverTimezone=UTC";
    private Connection conn;
    private static SingletonDatabase db = new SingletonDatabase();
    public static SingletonDatabase getInstance(){
        return db;
    }

    public void getConnection() throws SQLException {
        conn = DriverManager.getConnection(URL, "root", "password");

    }

    public void close() throws SQLException {
        conn.close();

    }

//    public static void main(String[] args) {
//        SingletonDatabase db = SingletonDatabase.getInstance();
//
//        SingletonDb singletonDb = SingletonDb.INSTANCE();
//
//    }

    public enum SingletonDb {
        INSTANCE;
        private static final String URL = "";
        private Connection connect;
        private static final String connection = "CONNECTION!";

        public void getConnection() throws SQLException {
            connect = DriverManager.getConnection(URL, "rootUser", "clientDetails22");
            System.out.println("Connected! ");
        }
        public void closeConnection() throws SQLException {
            connect.close();
            System.out.println("Connection closed!!");
        }


        public static void main(String[] args) {

            var Db = SingletonDb.INSTANCE;
            try {
                Db.getConnection();
            } catch (SQLException e) {
                System.out.println("connection could not be established!");
            }

            try {
                Db.closeConnection();
            } catch (SQLException e) {
                System.out.println("connection could not close, resources are leaking!");
            }

        }

    }

}
