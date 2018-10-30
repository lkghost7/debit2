package by.itacademy.dao;


import by.itacademy.connection.ConnectionPool;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.hibernate.Session;

import java.io.Serializable;


@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserDao {
    private static final Object LOCK = new Object();
    private static UserDao INSTANCE = null;

    public static UserDao getInstance() {
        if (INSTANCE == null) {
            synchronized (LOCK) {
                if (INSTANCE == null) {
                    INSTANCE = new UserDao();
                }
            }
        }
        return INSTANCE;
    }

    public Long saveUser(SystemUserDao systemUser) {
        Session currentSession = ConnectionPool.getInstance().getConnection();
        currentSession.beginTransaction();
        Serializable id = currentSession.save(systemUser);
        currentSession.getTransaction().commit();
        currentSession.close();
        return (Long) id;
    }
}