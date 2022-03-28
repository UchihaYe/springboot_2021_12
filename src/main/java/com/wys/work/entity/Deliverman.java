package com.wys.work.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
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

    @TableId(value = "dno", type = IdType.AUTO)
    private Integer dno;

    private String dname;

    private String dphone;

    private Integer fno;
    @TableField(exist = false)
    private String fname;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public Integer getDno() {
        return dno;
    }

    public void setDno(Integer dno) {
        this.dno = dno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDphone() {
        return dphone;
    }

    public void setDphone(String dphone) {
        this.dphone = dphone;
    }

    public Integer getFno() {
        return fno;
    }

    public void setFno(Integer fno) {
        this.fno = fno;
    }

    @Override
    public String toString() {
        return "Deliverman{" +
                "dno=" + dno +
                ", dname=" + dname +
                ", dphone=" + dphone +
                ", fno=" + fno +
                "}";
    }
}
