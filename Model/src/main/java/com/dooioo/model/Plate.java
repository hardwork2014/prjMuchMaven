package com.dooioo.model;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;

/**
 * Created by hqm on 14-6-9.
 */
@Alias("plate")
public class Plate implements Serializable {
    private String districtNo;
    private String plateName;
    private String plateSpelling;

    public String getDistrictNo() {
        return districtNo;
    }

    public void setDistrictNo(String districtNo) {
        this.districtNo = districtNo;
    }

    public String getPlateName() {
        return plateName;
    }

    public void setPlateName(String plateName) {
        this.plateName = plateName;
    }

    public String getPlateSpelling() {
        return plateSpelling;
    }

    public void setPlateSpelling(String spelling) {
        this.plateSpelling = spelling;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "districtNo='" + districtNo + '\'' +
                ", plateName='" + plateName + '\'' +
                ", plateSpelling='" + plateSpelling + '\'' +
                '}';
    }
}
