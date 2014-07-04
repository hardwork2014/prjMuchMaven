package com.dooioo.base.model;

import java.io.Serializable;

/**
 * 分页抽象类
 * Created by hqm on 14-6-6.
 */
public abstract class Page implements Serializable {

    /**
     * 页号，第一页为1
     */
    private int pageNo = 1;

    /**
     * 尺寸
     */
    private int pageSize = 1;

    /**
     * 排序
     */
    private String order;

    /**
     * 查询 条件
     */
    private String where;

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    /**
     * 获取 where/order 的sql条件
     * @return
     */
    public String getExtensionSql(){
        return (this.getWhere() == null ? "" : " where " + this.getWhere())
                +(this.getOrder() == null ? "" : " order by " + this.getOrder());
    }

    public String getLimitSql(){
        return " limit " +
                (this.getPageNo() < 1 ? 0 : this.getPageNo() - 1) * this.getPageSize() +
                 "," + this.getPageSize();
    }

}
