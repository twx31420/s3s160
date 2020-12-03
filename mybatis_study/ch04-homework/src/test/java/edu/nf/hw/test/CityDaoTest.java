package edu.nf.hw.test;

import edu.nf.hw.dao.CityDao;
import edu.nf.hw.dao.impl.CityDaoImpl;
import edu.nf.hw.entity.City;
import org.junit.Test;

public class CityDaoTest {
    @Test
    public void testListCity(){
        CityDao dao=new CityDaoImpl();
        dao.listCity().forEach(user-> System.out.println(user.getName()));
    }
}
