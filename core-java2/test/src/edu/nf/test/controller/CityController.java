package edu.nf.test.controller;

import edu.nf.test.entity.PageBean;
import edu.nf.test.service.CityService;
import org.nf.mvc.core.WebRequest;
import org.nf.mvc.view.JsonView;
import org.nf.mvc.view.View;

/**
 * @author 天文学
 */
public class CityController {
    @WebRequest("/page/list")
    public View getCitys(PageBean page){
        CityService service=new CityService();
        service.listCity(page);
        return new JsonView(page);
    }
}
