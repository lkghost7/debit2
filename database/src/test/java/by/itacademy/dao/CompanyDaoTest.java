package by.itacademy.dao;

import by.itacademy.model.Company;
import org.junit.Assert;
import org.junit.Test;
public class CompanyDaoTest {

    @Test
    public void findById() {
        Company nameId = CompanyDao.getInstance().findById(1L);
        Assert.assertEquals(nameId.getName(), "БТЛЦ");
    }

    @Test
    public void save() {
        Company company = new Company();
        company.setName("Новичёк2");
        Assert.assertNotNull(company);
        String name = company.getName();
        Assert.assertEquals(name, "Новичёк2");
        CompanyDao.getInstance().save(company);
        CompanyDao.getInstance().delete(company);
    }

}
