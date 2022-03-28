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
public class Warehouse implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "Wno", type = IdType.AUTO)
    private String Wno;

    private String Mno;

    private String Wname;

    private String Whead;

    private String Wphone;

    private String Waddress;


    public String getWno() {
        return Wno;
    }

    public void setWno(String Wno) {
        this.Wno = Wno;
    }

    public String getMno() {
        return Mno;
    }

    public void setMno(String Mno) {
        this.Mno = Mno;
    }

    public String getWname() {
        return Wname;
    }

    public void setWname(String Wname) {
        this.Wname = Wname;
    }

    public String getWhead() {
        return Whead;
    }

    public void setWhead(String Whead) {
        this.Whead = Whead;
    }

    public String getWphone() {
        return Wphone;
    }

    public void setWphone(String Wphone) {
        this.Wphone = Wphone;
    }

    public String getWaddress() {
        return Waddress;
    }

    public void setWaddress(String Waddress) {
        this.Waddress = Waddress;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
        "Wno=" + Wno +
        ", Mno=" + Mno +
        ", Wname=" + Wname +
        ", Whead=" + Whead +
        ", Wphone=" + Wphone +
        ", Waddress=" + Waddress +
        "}";
    }
}
