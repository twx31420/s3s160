package edu.nf.test;

import edu.nf.hw2.controller.CityServlet;
import org.junit.Test;

public class TestController {
    @Test
    public void testlist(){
        System.out.println(new CityServlet().listCity());
    }
}
