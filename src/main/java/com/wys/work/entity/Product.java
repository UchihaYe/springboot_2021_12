package com.wys.work.entity;

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
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "pno", type = IdType.AUTO)
    private Integer pno;

    private String pname;

    private Integer pprice;

    public Integer getPprice() {
        return pprice;
    }

    public void setPprice(Integer pprice) {
        this.pprice = pprice;
    }

    public Integer getPno() {
        return pno;
    }

    public void setPno(Integer pno) {
        this.pno = pno;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pno=" + pno +
                ", pname='" + pname + '\'' +
                ", pprice=" + pprice +
                '}';
    }
}
