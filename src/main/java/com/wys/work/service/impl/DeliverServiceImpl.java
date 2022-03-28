package com.wys.work.service.impl;

import com.wys.work.entity.Deliver;
import com.wys.work.mapper.DeliverMapper;
import com.wys.work.service.DeliverService;
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
public class DeliverServiceImpl extends ServiceImpl<DeliverMapper, Deliver> implements DeliverService {


    @Override
    public List<Deliver> getCdname() {
        return this.baseMapper.getCdname();
    }
}
