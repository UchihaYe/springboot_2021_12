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
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "CUno", type = IdType.AUTO)
    private String CUno;

    private String CUaddress;

    private String CUname;

    private String CUphone;


    public String getCUno() {
        return CUno;
    }

    public void setCUno(String CUno) {
        this.CUno = CUno;
    }

    public String getCUaddress() {
        return CUaddress;
    }

    public void setCUaddress(String CUaddress) {
        this.CUaddress = CUaddress;
    }

    public String getCUname() {
        return CUname;
    }

    public void setCUname(String CUname) {
        this.CUname = CUname;
    }

    public String getCUphone() {
        return CUphone;
    }

    public void setCUphone(String CUphone) {
        this.CUphone = CUphone;
    }

    @Override
    public String toString() {
        return "Customer{" +
        "CUno=" + CUno +
        ", CUaddress=" + CUaddress +
        ", CUname=" + CUname +
        ", CUphone=" + CUphone +
        "}";
    }
}
