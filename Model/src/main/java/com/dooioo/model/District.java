package com.dooioo.model;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;
import java.util.List;

/**
 * Created by hqm on 14-6-6.
 */
@Alias("district")
public class District implements Serializable {

    private String  districtNo;             // 区域主键编号
    private String  districtName;    // 区域名称
    private String  districtSpelling;  // 区域名称全拼
    private List<Plate> plateList;

    public String getDistrictSpelling() {
        return districtSpelling;
    }

    public void setDistrictSpelling(String districtSpelling) {
        this.districtSpelling = districtSpelling;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getDistrictNo() {
        return districtNo;
    }

    public void setDistrictNo(String districtNo) {
        this.districtNo = districtNo;
    }

    public List<Plate> getPlateList() {
        return plateList;
    }

    public void setPlateList(List<Plate> plateList) {
        this.plateList = plateList;
    }

    @Override
    public String toString() {
        return "District{" +
                "districtNo='" + districtNo + '\'' +
                ", districtName='" + districtName + '\'' +
                ", districtSpelling='" + districtSpelling + '\'' +
                ", plateList=" + plateList +
                '}';
    }
}
