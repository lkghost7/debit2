package by.itacademy.dao;

import by.itacademy.model.Company;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompanDaoImplTest {

    @Test
    public void save() {
        CompanDaoImpl dao = new CompanDaoImpl(Company.class);
        Company company = new Company();
        company.setName("Vinty-Company");
       dao.save(company);
    }
}
