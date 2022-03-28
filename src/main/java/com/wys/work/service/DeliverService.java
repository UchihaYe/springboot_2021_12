package com.wys.work.service;

import com.wys.work.entity.Deliver;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 王叶盛
 * @since 2021-12-30
 */
public interface DeliverService extends IService<Deliver> {

    List<Deliver> getCdname();
}
