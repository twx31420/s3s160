package edu.nf.hw2.controller;

import edu.nf.hw2.entity.City;
import edu.nf.hw2.service.CityService;
import org.evergreen.web.RequestMethod;
import org.evergreen.web.ViewResult;
import org.evergreen.web.annotation.RequestMapping;
import org.evergreen.web.view.Json;

import java.util.List;

/**
 * @author 天文学
 */
public class CityServlet {
    @RequestMapping(value = "/list")
    public ViewResult listCity(){
        return new Json(new CityService().cityList());
    }

}
