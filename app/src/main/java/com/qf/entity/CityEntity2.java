package com.qf.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/8/24 0024. on 16:51
 * xiaohl_902
 */
public class CityEntity2 implements Serializable{
    private String short_py;
    private String pinyin;
    private String cid;
    private String name;
    private int type = 1;
    private String zm ;

    public String getZm() {
        return zm;
    }

    public void setZm(String zm) {
        this.zm = zm;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getShort_py() {
        return short_py;
    }

    public void setShort_py(String short_py) {
        this.short_py = short_py;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
