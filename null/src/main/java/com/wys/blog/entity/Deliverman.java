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
public class Deliverman implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "Dno", type = IdType.AUTO)
    private String Dno;

    private String Mno;

    private String SCno;

    private String Dname;

    private String Dphone;


    public String getDno() {
        return Dno;
    }

    public void setDno(String Dno) {
        this.Dno = Dno;
    }

    public String getMno() {
        return Mno;
    }

    public void setMno(String Mno) {
        this.Mno = Mno;
    }

    public String getSCno() {
        return SCno;
    }

    public void setSCno(String SCno) {
        this.SCno = SCno;
    }

    public String getDname() {
        return Dname;
    }

    public void setDname(String Dname) {
        this.Dname = Dname;
    }

    public String getDphone() {
        return Dphone;
    }

    public void setDphone(String Dphone) {
        this.Dphone = Dphone;
    }

    @Override
    public String toString() {
        return "Deliverman{" +
        "Dno=" + Dno +
        ", Mno=" + Mno +
        ", SCno=" + SCno +
        ", Dname=" + Dname +
        ", Dphone=" + Dphone +
        "}";
    }
}
