package com.wys.work.mapper;

import com.wys.work.entity.Buy;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 王叶盛
 * @since 2021-12-30
 */
@Mapper
public interface BuyMapper extends BaseMapper<Buy> {

    List<Buy> getCpname();

}
