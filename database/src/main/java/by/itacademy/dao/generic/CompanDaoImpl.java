package by.itacademy.dao.generic;

import by.itacademy.dao.generic.BaseDaoImpl;
import by.itacademy.dao.generic.CompanDao;
import by.itacademy.model.Company;

public class CompanDaoImpl extends BaseDaoImpl<Company> implements CompanDao {

    public CompanDaoImpl(Class<Company> modelClass) {
        super(modelClass);
    }
}
