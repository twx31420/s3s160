package edu.nf.eshop.test.controller;

import edu.nf.eshop.test.entity.PageBean;
import edu.nf.eshop.test.service.CityService;
import org.nf.mvc.core.WebRequest;
import org.nf.mvc.view.JsonView;
import org.nf.mvc.view.View;

public class CityController {
    @WebRequest("/page/get")
    public View listCity(PageBean page){
        return new JsonView(new CityService().cityList(page));
    }
}
