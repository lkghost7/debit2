package by.itacademy.dao;

import by.itacademy.model.Company;
import org.junit.Assert;
import org.junit.Test;
public class CompanyDaoTest {

    @Test
    public void findById() {
        Company name = CompanyDao.getInstance().findById(1L);
        Assert.assertEquals(name.getName(), "БТЛЦ");
    }

    @Test
    public void save() {
        Company company = new Company();
        company.setName("Новичёк2");
        CompanyDao.getInstance().save(company);
        CompanyDao.getInstance().delete(company);
    }

}
