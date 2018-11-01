package by.itacademy.dao;

import by.itacademy.model.BaseEntity;
import org.junit.Test;

public abstract class BaseDaoTest<T extends BaseEntity> {
    protected abstract BaseDao<T> getDao();
    protected abstract T getModel();

    @Test
    public void testSave() {
        T model = getModel();
        getDao().save(model);

    }
}
