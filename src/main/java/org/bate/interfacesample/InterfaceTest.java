package org.bate.interfacesample;

public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println("...MYSQL CONNECTION....");
        DbConnection d;
        d = new Mysql();
        d.loadDrivers();
        d.getConnection();
        d.statement();
        d.connectionClose();

        System.out.println("....ORACLE CONNECTION....");

        d = new OracleDb();
        d.loadDrivers();
        d.getConnection();
        d.statement();
        d.connectionClose();
    }
}
