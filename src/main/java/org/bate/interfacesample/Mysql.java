package org.bate.interfacesample;

public class Mysql implements DbConnection{


    @Override
    public void loadDrivers() {
        System.out.println("mysql driver loaded");

    }

    @Override
    public void getConnection() {
        System.out.println("Execute statements");

    }

    @Override
    public void statement() {
        System.out.println("Get statement");

    }

    @Override
    public void resultSet() {
        System.out.println("Get result set..");

    }

    @Override
    public void connectionClose() {
        System.out.println("Connection closed!");

    }
}
