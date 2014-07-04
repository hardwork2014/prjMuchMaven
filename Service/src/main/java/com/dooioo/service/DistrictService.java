package com.dooioo.service;

import com.dooioo.base.service.BaseService;
import com.dooioo.model.District;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by hqm on 14-6-6.
 */
@Service
public class DistrictService extends BaseService<District>{

    /**
     * 两张表数据关联 返回list
     * @return
     */
    public List<District> queryAllDistrict(){
        return this.selectList("queryAllDistrict");
    }

    /**
     * 两张表数据关联 返回map
     * @return
     */
    public Map<String,Map<String,String>> querySearchMap(){
        return this.selectMap(sqlId("querySearchMap"),"spelling");
    }
}
