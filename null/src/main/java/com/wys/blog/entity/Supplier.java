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
public class Supplier implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "Sno", type = IdType.AUTO)
    private String Sno;

    private String Mno;

    private String Sname;

    private String Saddres;

    private String Sphone;


    public String getSno() {
        return Sno;
    }

    public void setSno(String Sno) {
        this.Sno = Sno;
    }

    public String getMno() {
        return Mno;
    }

    public void setMno(String Mno) {
        this.Mno = Mno;
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String Sname) {
        this.Sname = Sname;
    }

    public String getSaddres() {
        return Saddres;
    }

    public void setSaddres(String Saddres) {
        this.Saddres = Saddres;
    }

    public String getSphone() {
        return Sphone;
    }

    public void setSphone(String Sphone) {
        this.Sphone = Sphone;
    }

    @Override
    public String toString() {
        return "Supplier{" +
        "Sno=" + Sno +
        ", Mno=" + Mno +
        ", Sname=" + Sname +
        ", Saddres=" + Saddres +
        ", Sphone=" + Sphone +
        "}";
    }
}
