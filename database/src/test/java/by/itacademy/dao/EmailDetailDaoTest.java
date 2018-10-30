package by.itacademy.dao;

import by.itacademy.model.EmailDetail;
import org.junit.Test;

import javax.validation.constraints.Email;

import static org.junit.Assert.*;

public class EmailDetailDaoTest {

    @Test
    public void findById() {
    }

    @Test
    public void save() {
        EmailDetail emailDetail = new EmailDetail();
        emailDetail.setEmail("lk1@tut.by");
        EmailDetailDao.getInstance().save(emailDetail);
        EmailDetailDao.getInstance().delete(emailDetail);
    }

    @Test
    public void findAll() {
    }

    @Test
    public void delete() {
    }
}