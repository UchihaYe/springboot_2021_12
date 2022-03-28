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
public class Managementcenter implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "Mno", type = IdType.AUTO)
    private String Mno;

    private String Mhead;

    private String Maddress;

    private String Mphone;


    public String getMno() {
        return Mno;
    }

    public void setMno(String Mno) {
        this.Mno = Mno;
    }

    public String getMhead() {
        return Mhead;
    }

    public void setMhead(String Mhead) {
        this.Mhead = Mhead;
    }

    public String getMaddress() {
        return Maddress;
    }

    public void setMaddress(String Maddress) {
        this.Maddress = Maddress;
    }

    public String getMphone() {
        return Mphone;
    }

    public void setMphone(String Mphone) {
        this.Mphone = Mphone;
    }

    @Override
    public String toString() {
        return "Managementcenter{" +
        "Mno=" + Mno +
        ", Mhead=" + Mhead +
        ", Maddress=" + Maddress +
        ", Mphone=" + Mphone +
        "}";
    }
}
