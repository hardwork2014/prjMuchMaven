package com.dooioo.model;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;
import java.util.List;

/**
 * Created by hqm on 14-6-10.
 */
@Alias("article")
public class Article implements Serializable {

    private String title;
    private String remark;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
