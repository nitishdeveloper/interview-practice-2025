package DesignPatternPractice.databaseAbstractFactory;

import DesignPatternPractice.databaseAbstractFactory.concreteFactories.MySqlFactory;

public class DatabaseConnectDemo {
    public static void main(String[] args) {
        DatabaseClient databaseClient = new DatabaseClient(new MySqlFactory());
        databaseClient.executeQuery("SELECT * FROM users");
    }
}
