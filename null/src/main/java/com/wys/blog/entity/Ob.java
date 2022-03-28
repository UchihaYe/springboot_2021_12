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
public class Ob implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "Wno", type = IdType.AUTO)
    private String Wno;

    private String Gno;

    private Date OBtime;


    public String getWno() {
        return Wno;
    }

    public void setWno(String Wno) {
        this.Wno = Wno;
    }

    public String getGno() {
        return Gno;
    }

    public void setGno(String Gno) {
        this.Gno = Gno;
    }

    public Date getOBtime() {
        return OBtime;
    }

    public void setOBtime(Date OBtime) {
        this.OBtime = OBtime;
    }

    @Override
    public String toString() {
        return "Ob{" +
        "Wno=" + Wno +
        ", Gno=" + Gno +
        ", OBtime=" + OBtime +
        "}";
    }
}
