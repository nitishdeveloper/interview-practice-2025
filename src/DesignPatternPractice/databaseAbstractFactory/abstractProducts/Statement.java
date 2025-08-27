package DesignPatternPractice.databaseAbstractFactory.abstractProducts;

public interface Statement {
    void prepare(String prepare);
    ResultSet executeStatement();
}
