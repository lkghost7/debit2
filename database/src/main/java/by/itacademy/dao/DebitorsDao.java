package by.itacademy.dao;

import by.itacademy.connection.ConnectionPool;
import by.itacademy.model.Debitors;
import org.hibernate.Session;

import java.io.Serializable;
import java.util.List;

public class DebitorsDao {
    private static final Object LOCK = new Object();
    private static DebitorsDao INSTANCE = null;

    public static DebitorsDao getInstance() {
        if (INSTANCE == null) {
            synchronized (LOCK) {
                if (INSTANCE == null) {
                    INSTANCE = new DebitorsDao();
                }
            }
        }
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

    public List<Debitors> findAll() {
        Session currentSession = ConnectionPool.getInstance().getConnection();
        List<Debitors> debitorsList = currentSession.createQuery("select d from Debitors d", Debitors.class).list();
        currentSession.close();
        return debitorsList;
    }

    public void delete(Debitors debitors) {
        Session session = ConnectionPool.getInstance().getConnection();
        session.beginTransaction();
        session.delete(debitors);
        session.getTransaction().commit();
        session.close();
    }
}