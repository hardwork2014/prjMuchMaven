package com.dooioo.service;

import com.dooioo.base.service.BaseService;
import com.dooioo.model.Plate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hqm on 14-6-9.
 */
@Service
public class PlateService extends BaseService<Plate> {
    public List<Plate> queryAllPlate(){
        return this.selectList("queryAllPlate");
    }

}
