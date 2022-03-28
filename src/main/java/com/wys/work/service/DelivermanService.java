package com.wys.work.service;

import com.wys.work.entity.Buy;
import com.wys.work.entity.Deliverman;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 王叶盛
 * @since 2021-12-30
 */
public interface DelivermanService extends IService<Deliverman> {

    List<Deliverman> getFname();
    Deliverman updateAll();
}
