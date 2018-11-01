package by.itacademy.dao;

import by.itacademy.model.BaseEntity;

public interface BaseDao <T extends BaseEntity> {

    void save(T entity);

}