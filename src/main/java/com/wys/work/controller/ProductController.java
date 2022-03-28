package com.wys.work.controller;


import com.wys.work.entity.Customer;
import com.wys.work.entity.Product;
import com.wys.work.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 王叶盛
 * @since 2021-12-30
 */
@Controller
public class ProductController {
    
    @Autowired
    ProductService productService;

    @RequestMapping("/products")
    public String list(Model model) {
        List<Product> products = productService.list();
        model.addAttribute("products", products);
        return "product/list";
    }

    @GetMapping("/product")
    public String gotoAddPg(Model model) {
        return "/product/add";
    }

    @PostMapping("/product")
    public String addProduct(Product product) {
        productService.save(product);
        return "redirect:/products";
    }

    @GetMapping("/updateProduct/{pno}")
    public String toUpdate(@PathVariable("pno") String pno, Model model) {
        Product product = productService.getById(pno);
        model.addAttribute("product", product);
        return "/product/update";
    }

    @PostMapping("/saveProduct")
    public String updateProduct(Product product) {
        productService.updateById(product);
        return "redirect:/products";
    }


    @GetMapping("/delProduct/{pon}")
    public String toDelete(@PathVariable("pno") String pno) {
        productService.removeById(pno);
        return "redirect:/products";
    }
}

