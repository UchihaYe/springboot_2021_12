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
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "cno", type = IdType.AUTO)
    private Integer cno;

    private String cname;

    private String cphone;

    private String caddress;


    public Integer getCno() {
        return cno;
    }

    public void setCno(Integer cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCphone() {
        return cphone;
    }

    public void setCphone(String cphone) {
        this.cphone = cphone;
    }

    public String getCaddress() {
        return caddress;
    }

    public void setCaddress(String caddress) {
        this.caddress = caddress;
    }

    @Override
    public String toString() {
        return "Customer{" +
        "cno=" + cno +
        ", cname=" + cname +
        ", cphone=" + cphone +
        ", caddress=" + caddress +
        "}";
    }
}
