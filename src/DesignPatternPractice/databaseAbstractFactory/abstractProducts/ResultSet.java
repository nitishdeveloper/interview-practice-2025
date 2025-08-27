package DesignPatternPractice.databaseAbstractFactory.abstractProducts;

public interface ResultSet {
    boolean next();
    String getString(String column);
}
