package edu.nf.chhw.test;

import edu.nf.chhw.dao.CityDao;
import edu.nf.chhw.dao.impl.CityDaoImpl;
import edu.nf.chhw.entity.City;
import org.junit.Test;

public class CityDaoTest {
    @Test
    public void testSave(){
        getdao().save(getcity());
    }
    @Test
    public void testUpdate(){
        getdao().update(getcity());
    }
    @Test
    public void testDelete(){
        getdao().delete(621050200);
    }


   public CityDao getdao(){
        return new CityDaoImpl();
   }
   public City getcity(){
        return new City(621050200,"天文","tianwen","星空");
   }
}
