package com.wys.work.controller;


import com.wys.work.entity.Buy;
import com.wys.work.entity.Customer;
import com.wys.work.entity.Product;
import com.wys.work.service.BuyService;
import com.wys.work.service.CustomerService;
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
public class BuyController {

    @Autowired
    BuyService buyService;

    @Autowired
    CustomerService customerService;

    @Autowired
    ProductService productService;

    @RequestMapping("/buys")
    public String list(Model model) {
        List<Buy> buys = buyService.getCpname();
        List<Customer> customers = customerService.list();
        List<Product> products = productService.list();
        model.addAttribute("buys", buys);
        model.addAttribute("customers", customers);
        model.addAttribute("products", products);
        return "buy/list";
    }


    @GetMapping("/buy")
    public String gotoAddPg(Model model) {
        List<Customer> customers = customerService.list();
        List<Product> products = productService.list();
        model.addAttribute("customers", customers);
        model.addAttribute("products", products);
        return "/buy/add";
    }

    @PostMapping("/buy")
    public String addBuy(Buy buy) {
        buyService.save(buy);
        return "redirect:/buys";
    }

    @GetMapping("/updateBuy/{bid}")
    public String toUpdate(@PathVariable("bid") Integer bid, Model model) {
        List<Customer> customers = customerService.list();
        List<Product> products = productService.list();
        model.addAttribute("customers", customers);
        model.addAttribute("products", products);
        Buy buy = buyService.getById(bid);
        model.addAttribute("buy", buy);
        return "/buy/update";
    }

    @PostMapping("/saveBuy")
    public String updateBuy(Buy buy) {

        buyService.updateById(buy);
        return "redirect:/buys";
    }


    @GetMapping("/delBuy/{bid}")
    public String toDelete(@PathVariable("bid") String bid) {
        buyService.removeById(bid);
        return "redirect:/buys";
    }
}

