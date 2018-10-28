package by.itacademy.dao;

import by.itacademy.model.Debitors;
import org.junit.Test;

import java.util.List;

public class DebitorsDaoTest {

    @Test
    public void save() {
        Debitors debitors = new Debitors();
        debitors.setSubdivisions("test1");
        debitors.setDebitor("test2");
        debitors.setDateOfOccurrence("test3");
        debitors.setPrincipalAmount("test4");
        debitors.setSentDate("data");

        DebitorsDao.getInstance().save(debitors);
        DebitorsDao.getInstance().delete(debitors);
    }

    @Test
    public void findAll() {
        List<Debitors> list = DebitorsDao.getInstance().findAll();
        list.forEach(System.out::println);
    }
}