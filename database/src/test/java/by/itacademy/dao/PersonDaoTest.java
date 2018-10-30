package by.itacademy.dao;

import by.itacademy.model.Person;
import org.junit.Test;
public class PersonDaoTest {

    @Test
    public void save() {
        Person person = new Person();
        person.setName("ваня");
        person.setFamaly("Мванко");

//        ConnectionPool.getInstance().getConnection().find()
    }
}