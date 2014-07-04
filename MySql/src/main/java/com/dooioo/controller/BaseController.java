package com.dooioo.controller;

import com.dooioo.common.Configuration;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * Created by PC-S510 on 2014/7/3.
 */
public class BaseController {

    /**
     * 系统配置参数
     * @return
     */
    @ModelAttribute("config")
    public Configuration configuration(){
        return Configuration.getIntance();
    }
}
