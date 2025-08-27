package DesignPatternPractice.databaseAbstractFactory.abstractFactory;

import DesignPatternPractice.databaseAbstractFactory.abstractProducts.Connection;
import DesignPatternPractice.databaseAbstractFactory.abstractProducts.ResultSet;
import DesignPatternPractice.databaseAbstractFactory.abstractProducts.Statement;

public interface DatabaseFactory {
    Connection createConnection();
    Statement createStatement();
    ResultSet createResultSet();
}
