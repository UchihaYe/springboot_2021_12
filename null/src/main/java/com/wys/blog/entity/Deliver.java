package com.wys.blog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
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
public class Deliver implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "CUno", type = IdType.AUTO)
    private String CUno;

    private String Dno;

    private Date DeliverTime;

    private String Freight;


    public String getCUno() {
        return CUno;
    }

    public void setCUno(String CUno) {
        this.CUno = CUno;
    }

    public String getDno() {
        return Dno;
    }

    public void setDno(String Dno) {
        this.Dno = Dno;
    }

    public Date getDeliverTime() {
        return DeliverTime;
    }

    public void setDeliverTime(Date DeliverTime) {
        this.DeliverTime = DeliverTime;
    }

    public String getFreight() {
        return Freight;
    }

    public void setFreight(String Freight) {
        this.Freight = Freight;
    }

    @Override
    public String toString() {
        return "Deliver{" +
        "CUno=" + CUno +
        ", Dno=" + Dno +
        ", DeliverTime=" + DeliverTime +
        ", Freight=" + Freight +
        "}";
    }
}
