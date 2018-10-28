package by.itacademy.dao;

import by.itacademy.connection.ConnectionPool;
import by.itacademy.model.RegistryOfContracts;
import org.hibernate.Session;

import java.io.Serializable;
import java.util.List;

public class RegistryContractsDao {
    private static final RegistryContractsDao INSTANCE = new RegistryContractsDao();

    public static by.itacademy.dao.RegistryContractsDao getInstance() {
        return INSTANCE;
    }

    public Long save(RegistryOfContracts registry) {
        Session currentSession = ConnectionPool.getInstance().getConnection();
        currentSession.beginTransaction();
        Serializable id = currentSession.save(registry);
        currentSession.getTransaction().commit();
        currentSession.close();
        return (Long) id;
    }

    public List<RegistryOfContracts> findAll() {
        Session currentSession = ConnectionPool.getInstance().getConnection();
        List<RegistryOfContracts> registry = currentSession.createQuery("select r from RegistryOfContracts r",
                RegistryOfContracts.class).list();
        currentSession.close();
        return registry;
    }

    public void delete(RegistryOfContracts registry) {
        Session session = ConnectionPool.getInstance().getConnection();
        session.beginTransaction();
        session.delete(registry);
        session.getTransaction().commit();
        session.close();
    }
}