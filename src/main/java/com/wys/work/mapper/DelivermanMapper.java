package com.wys.work.mapper;

import com.wys.work.entity.Buy;
import com.wys.work.entity.Deliverman;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 王叶盛
 * @since 2021-12-30
 */
public interface DelivermanMapper extends BaseMapper<Deliverman> {

    List<Deliverman> getFname();
    Deliverman updateAll();

}
