package DesignPatternPractice.databaseAbstractFactory;


import DesignPatternPractice.databaseAbstractFactory.abstractFactory.DatabaseFactory;
import DesignPatternPractice.databaseAbstractFactory.abstractProducts.Connection;
import DesignPatternPractice.databaseAbstractFactory.abstractProducts.ResultSet;
import DesignPatternPractice.databaseAbstractFactory.abstractProducts.Statement;

public class DatabaseClient {
    private final DatabaseFactory databaseFactory;

    public DatabaseClient(DatabaseFactory databaseFactory) {
        this.databaseFactory = databaseFactory;
    }

    public void executeQuery(String query) {
        Connection connection = databaseFactory.createConnection();
        Statement statement = databaseFactory.createStatement();
        connection.connect();
        statement.prepare(query);
        ResultSet resultSet = databaseFactory.createResultSet();

        while (resultSet.next()) {
            System.out.println(resultSet.getString("name"));
        }

        connection.disconnect();
    }
}
