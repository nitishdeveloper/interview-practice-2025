package DesignPatternPractice.databaseAbstractFactory.concreteProducts;

import DesignPatternPractice.databaseAbstractFactory.abstractProducts.ResultSet;
import DesignPatternPractice.databaseAbstractFactory.abstractProducts.Statement;

public class MySqlStatement implements Statement {
    private String query;

    @Override
    public void prepare(String query) {
        this.query = query;
        System.out.println("Mysql statement prepare :: " + query);
    }

    @Override
    public ResultSet executeStatement() {
        System.out.println("Mysql statement executeStatement : "+query);
        return new MySqlResultSet();
    }
}
