package com.wys.work.service.impl;

import com.wys.work.entity.Buy;
import com.wys.work.entity.Deliverman;
import com.wys.work.mapper.DelivermanMapper;
import com.wys.work.service.DelivermanService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 王叶盛
 * @since 2021-12-30
 */
@Service
public class DelivermanServiceImpl extends ServiceImpl<DelivermanMapper, Deliverman> implements DelivermanService {


    @Override
    public List<Deliverman> getFname() {
        return this.baseMapper.getFname();
    }

    @Override
    public Deliverman updateAll() {
        return this.baseMapper.updateAll();
    }


}
