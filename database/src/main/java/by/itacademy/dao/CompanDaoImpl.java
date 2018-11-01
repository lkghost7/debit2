package by.itacademy.dao;

import by.itacademy.model.Company;

public class CompanDaoImpl extends BaseDaoImpl <Company> implements CompanDao {

    public CompanDaoImpl(Class<Company> modelClass) {
        super(modelClass);
    }
}
