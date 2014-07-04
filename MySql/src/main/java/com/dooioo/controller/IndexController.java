package com.dooioo.controller;

import com.dooioo.model.District;
import com.dooioo.model.Plate;
import com.dooioo.service.DistrictService;
import com.dooioo.service.PlateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * Created by hqm on 14-6-4.
 */
@Controller
@RequestMapping(value = "/*")
public class IndexController extends BaseController {
    @Autowired
    protected DistrictService districtService;
    @Autowired
    protected PlateService plateService;

    @RequestMapping(value = {"/index","/",""})
    protected String index(){
        return "index";
    }

    @RequestMapping(value = "/detail")
    protected String detail(Model model){
        Map<String,Map<String,String>> map = districtService.querySearchMap();
        model.addAttribute("map",map);
        List<District> list = districtService.queryAllDistrict();
        model.addAttribute("districtList",list);
        return "detail";
    }



}
