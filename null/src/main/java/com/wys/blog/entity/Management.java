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
public class Management implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "Sno", type = IdType.AUTO)
    private String Sno;

    private String Wno;


    public String getSno() {
        return Sno;
    }

    public void setSno(String Sno) {
        this.Sno = Sno;
    }

    public String getWno() {
        return Wno;
    }

    public void setWno(String Wno) {
        this.Wno = Wno;
    }

    @Override
    public String toString() {
        return "Management{" +
        "Sno=" + Sno +
        ", Wno=" + Wno +
        "}";
    }
}
