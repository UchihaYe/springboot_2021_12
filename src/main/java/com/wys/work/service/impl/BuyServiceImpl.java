package com.wys.work.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.wys.work.entity.Buy;
import com.wys.work.entity.Customer;
import com.wys.work.mapper.BuyMapper;
import com.wys.work.service.BuyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Wrapper;
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
public class BuyServiceImpl extends ServiceImpl<BuyMapper, Buy> implements BuyService {
/*    @Override
    public List<Buy> getCname() {
        return this.baseMapper.getCname();
    }

    @Override
    public List<Buy> getPname() {
        return this.baseMapper.getPname();
    }*/

    @Override
    public List<Buy> getCpname() {
        return this.baseMapper.getCpname();
    }

//    @Select("SELECT  B.cname FROM buy  A LEFT JOIN customer  B ON A.CNO = B.Cno ")
//    @Override
//    public List getQueryList() {
//        return this.baseMapper.selectList();
//    }

}
