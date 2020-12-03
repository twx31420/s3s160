package edu.nf.ch08.contrller;

import edu.nf.ch08.entity.City;
import edu.nf.ch08.entity.PageBean;
import edu.nf.ch08.service.CityService;
import org.nf.mvc.core.WebRequest;
import org.nf.mvc.view.View;
import org.nf.mvc.view.impl.JsonView;

import java.util.List;


public class CitySevlet {
    @WebRequest("/page/get")
    public View que(PageBean page){
        CityService service=new CityService();
        service.getCitys(page);
        return new JsonView(page);
    }

}
