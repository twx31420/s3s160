package edu.nf.test;

import edu.nf.hw2.service.CityService;
import org.junit.Test;

public class TestService {
    @Test
    public void testCityList(){
        new CityService().cityList();
    }
}
