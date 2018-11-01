package by.itacademy.dao;

import by.itacademy.model.Company;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompanDaoImplTest extends  BaseDaoTest<Company> {

//    @Test
//    public void save() {
//        CompanDaoImpl dao = new CompanDaoImpl(Company.class);
//        Company company = new Company();
//        company.setName("Vinty-Company");
//       dao.save(company);
//    }

    private BaseDao<Company> dao = new CompanDaoImpl(Company.class);

    @Override
    protected BaseDao<Company> getDao() {
        return dao;
    }

    @Override
    protected Company getModel() {
        return new Company("Vintokril");
    }
}
