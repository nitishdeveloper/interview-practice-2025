package DesignPatternPractice.databaseAbstractFactory.concreteProducts;

import DesignPatternPractice.databaseAbstractFactory.abstractProducts.ResultSet;

public class MySqlResultSet implements ResultSet {
    private int currentRow = -1;
    private final int totalRows = 3;

    @Override
    public boolean next() {
        System.out.println("MySqlResultSet :: next");
        currentRow++;
        System.out.println("MySQL: Moving to row " + currentRow);
        return currentRow < totalRows;
    }

    @Override
    public String getString(String column) {
        System.out.println("MySqlResultSet :: getString :: column :: " + column);
        return "MySQL data: row " + column + ", column " + column;
    }
}
