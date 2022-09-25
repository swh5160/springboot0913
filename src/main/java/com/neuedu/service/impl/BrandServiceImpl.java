package com.neuedu.service.impl;

import com.neuedu.entity.Brand;
import com.neuedu.mapper.BrandMapper;
import com.neuedu.service.BrandService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 施子安
 * @create
 */
@Service
public class BrandServiceImpl implements BrandService {
    @Resource
    BrandMapper brandMapper;
    @Override
    public List<Brand> list() {
        return brandMapper.list();
    }
}
