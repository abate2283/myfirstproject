package org.bate.interfacesample;

public interface DbConnection {
    void loadDrivers();
    void getConnection();
    void statement();
    void resultSet();
    void connectionClose();
}
