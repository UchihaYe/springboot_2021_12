package com.wys.work.service.impl;

import com.wys.work.entity.Product;
import com.wys.work.mapper.ProductMapper;
import com.wys.work.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
