package edu.nf.hw.controller;

import edu.nf.hw.service.Cityservice;
import org.nf.mvc.core.WebRequest;
import org.nf.mvc.view.JsonView;
import org.nf.mvc.view.View;
import sun.net.util.IPAddressUtil;

/**
 * @author 天文学
 */
public class CityServlet {

    @WebRequest("/get")
    public View listcity(){
        return new JsonView(new Cityservice().cityList());
    }


}
