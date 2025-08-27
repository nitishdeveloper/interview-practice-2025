package DesignPatternPractice.databaseAbstractFactory.concreteFactories;

import DesignPatternPractice.databaseAbstractFactory.abstractFactory.DatabaseFactory;
import DesignPatternPractice.databaseAbstractFactory.abstractProducts.Connection;
import DesignPatternPractice.databaseAbstractFactory.abstractProducts.ResultSet;
import DesignPatternPractice.databaseAbstractFactory.abstractProducts.Statement;
import DesignPatternPractice.databaseAbstractFactory.concreteProducts.MySqlConnection;
import DesignPatternPractice.databaseAbstractFactory.concreteProducts.MySqlResultSet;
import DesignPatternPractice.databaseAbstractFactory.concreteProducts.MySqlStatement;

public class MySqlFactory implements DatabaseFactory {
    @Override
    public Connection createConnection() {
        return new MySqlConnection();
    }

    @Override
    public Statement createStatement() {
        return new MySqlStatement();
    }

    @Override
    public ResultSet createResultSet() {
        return new MySqlResultSet();
    }
}
