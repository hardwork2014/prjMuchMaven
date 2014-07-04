package com.dooioo.controller;

import com.dooioo.model.District;
import com.dooioo.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by hqm on 14-6-9.
 */
@Controller
@RequestMapping("/sale")
public class DetailController extends BaseController {
    @Autowired
    private DistrictService districtService;

    @RequestMapping("detail")
    public String detail(Model model){
        List<District> list = districtService.queryAllDistrict();
        model.addAttribute("list",list);
        return "detail";
    }
}
