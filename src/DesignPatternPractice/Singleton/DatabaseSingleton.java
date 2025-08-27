package DesignPatternPractice.Singleton;

import java.io.Serializable;

public class DatabaseSingleton implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;
    private static volatile DatabaseSingleton databaseInstance;

    private DatabaseSingleton() {
//        protect from reflection attach
        if (databaseInstance != null) {
            throw new RuntimeException("You can not create more than 1 object of database");
        }
    }

    // protect from multithreaded case
    public static DatabaseSingleton getInstance() {
        if (databaseInstance == null) {
            synchronized (DatabaseSingleton.class) {
                if (databaseInstance == null) {
                    databaseInstance = new DatabaseSingleton();
                }
            }
        }
        return databaseInstance;
    }

    public static DatabaseSingleton getNewInstance() {
        return Holder.INSTANT;
    }

    // Egger loading
    private static class Holder {
        static final DatabaseSingleton INSTANT = new DatabaseSingleton();
    }

    // protect from Serialization
    public Object readResolve() {
        return getNewInstance();
    }

    // protect from clone
    @Override
    public DatabaseSingleton clone() {
        return getNewInstance();
    }
}
