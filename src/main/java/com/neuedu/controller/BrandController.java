package com.neuedu.controller;

import com.neuedu.entity.Brand;
import com.neuedu.service.BrandService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 施子安
 * @create
 */
@RestController
@RequestMapping("/brand")
public class BrandController {
    @Resource
    BrandService brandService;
    @GetMapping("list")
    List<Brand> list(){
        return brandService.list();
    }
}
