package org.bate.interfacesample;

public class OracleDb implements DbConnection{
    @Override
    public void loadDrivers() {
        System.out.println("Oracle driver is loaded");
    }

    @Override
    public void getConnection() {
        System.out.println("Connected to database!");

    }

    @Override
    public void statement() {
        System.out.println("execute statement...");

    }

    @Override
    public void resultSet() {
        System.out.println("get Results");

    }

    @Override
    public void connectionClose() {
        System.out.println("Connection closed!");

    }
}
