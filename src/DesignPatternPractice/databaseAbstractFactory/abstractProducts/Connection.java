package DesignPatternPractice.databaseAbstractFactory.abstractProducts;

public interface Connection {
    void connect();
    void disconnect();
    ResultSet executeQuery(String query);
}
