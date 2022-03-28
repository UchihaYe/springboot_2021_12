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
public class Firm implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "fno", type = IdType.AUTO)
    private Integer fno;

    private String fname;

    private String faddress;


    public Integer getFno() {
        return fno;
    }

    public void setFno(Integer fno) {
        this.fno = fno;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFaddress() {
        return faddress;
    }

    public void setFaddress(String faddress) {
        this.faddress = faddress;
    }

    @Override
    public String toString() {
        return "Firm{" +
        "fno=" + fno +
        ", fname=" + fname +
        ", faddress=" + faddress +
        "}";
    }
}
