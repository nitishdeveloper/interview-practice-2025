package DesignPatternPractice.databaseAbstractFactory.concreteProducts;

import DesignPatternPractice.databaseAbstractFactory.abstractProducts.Connection;
import DesignPatternPractice.databaseAbstractFactory.abstractProducts.ResultSet;

public class MySqlConnection implements Connection {

    @Override
    public void connect() {
        System.out.println("MySql connection establish");
    }

    @Override
    public void disconnect() {
        System.out.println("MySql connection disconnect");
    }

    @Override
    public ResultSet executeQuery(String query) {
        System.out.println("MySqlConnection :: MySql executeQuery :: "+query);
        return new MySqlResultSet();
    }
}
