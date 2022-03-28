package com.wys.work.service.impl;

import com.wys.work.entity.Customer;
import com.wys.work.mapper.CustomerMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wys.work.service.CustomerService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 王叶盛
 * @since 2021-12-30
 */
@Service

public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements CustomerService {

}
