package by.itacademy.dao;

import by.itacademy.model.RegistryOfContracts;
import org.junit.Test;

import java.util.List;

public class RegistryContractsDaoTest {

    @Test
    public void save() {
        RegistryOfContracts registryOfContracts = new RegistryOfContracts();
        registryOfContracts.setNameOfCounterparty("test1");
        registryOfContracts.setNameOfCounterparty("test2");
        registryOfContracts.setConclusionDate("data");

        RegistryContractsDao.getInstance().save(registryOfContracts);
        RegistryContractsDao.getInstance().delete(registryOfContracts);
    }

    @Test
    public void findAll() {
        List<RegistryOfContracts> list = RegistryContractsDao.getInstance().findAll();
        list.forEach(System.out::println);
    }
}