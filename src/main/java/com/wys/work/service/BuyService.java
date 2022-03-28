package com.wys.work.service;

import com.wys.work.entity.Buy;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wys.work.entity.Customer;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 王叶盛
 * @since 2021-12-30
 */
public interface BuyService extends IService<Buy> {

//    public List<Buy> getCname();
//    public List<Buy> getPname();
    public List<Buy> getCpname();

}
