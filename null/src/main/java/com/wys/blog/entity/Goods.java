package com.wys.blog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 王叶盛
 * @since 2021-12-30
 */
public class Goods implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "Gno", type = IdType.AUTO)
    private String Gno;

    private String Gname;

    private String Gweight;

    private String Wtype;


    public String getGno() {
        return Gno;
    }

    public void setGno(String Gno) {
        this.Gno = Gno;
    }

    public String getGname() {
        return Gname;
    }

    public void setGname(String Gname) {
        this.Gname = Gname;
    }

    public String getGweight() {
        return Gweight;
    }

    public void setGweight(String Gweight) {
        this.Gweight = Gweight;
    }

    public String getWtype() {
        return Wtype;
    }

    public void setWtype(String Wtype) {
        this.Wtype = Wtype;
    }

    @Override
    public String toString() {
        return "Goods{" +
        "Gno=" + Gno +
        ", Gname=" + Gname +
        ", Gweight=" + Gweight +
        ", Wtype=" + Wtype +
        "}";
    }
}
