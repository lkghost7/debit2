package by.itacademy.dao;

import by.itacademy.connection.ConnectionPool;
import by.itacademy.model.Debitors;
import org.hibernate.Session;

import java.io.Serializable;

public class DebitorsDao {
    private static final DebitorsDao INSTANCE = new DebitorsDao();

    public static DebitorsDao getInstance() {
        return INSTANCE;
    }

    public Long save(Debitors debitors) {
        Session currentSession = ConnectionPool.getInstance().getConnection();
        currentSession.beginTransaction();
        Serializable id = currentSession.save(debitors);
        currentSession.getTransaction().commit();
        currentSession.close();
        return (Long) id;
    }
}