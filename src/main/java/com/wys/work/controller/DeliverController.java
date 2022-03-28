package com.wys.work.controller;


import com.wys.work.entity.Buy;
import com.wys.work.entity.Deliver;
import com.wys.work.entity.Customer;
import com.wys.work.entity.Deliverman;
import com.wys.work.service.DeliverService;
import com.wys.work.service.CustomerService;
import com.wys.work.service.DelivermanService;
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

public class DeliverController {

    @Autowired
    DeliverService deliverService;

    @Autowired
    CustomerService customerService;

    @Autowired
    DelivermanService delivermanService;

    @RequestMapping("/delivers")
    public String list(Model model) {
        List<Deliver> delivers = deliverService.getCdname();
        List<Customer> customers = customerService.list();
        List<Deliverman> delivermans = delivermanService.list();
        model.addAttribute("delivers", delivers);
        model.addAttribute("customers", customers);
        model.addAttribute("delivermans", delivermans);
        return "deliver/list";
    }


    @GetMapping("/deliver")
    public String gotoAddPg(Model model) {
        List<Customer> customers = customerService.list();
        List<Deliverman> delivermans = delivermanService.list();
        model.addAttribute("customers", customers);
        model.addAttribute("delivermans", delivermans);
        return "/deliver/add";
    }


//    @PostMapping("/deliver")
//    public String addDeliver(Deliver deliver) {
//        deliverService.save(deliver);
//        return "redirect:/delivers";
//    }

    @PostMapping("/deliver")
    public String addDeliver(Deliver deliver) {
        deliverService.save(deliver);
        return "redirect:/delivers";
    }

    @GetMapping("/updateDeliver/{did}")
    public String toUpdate(@PathVariable("did") Integer did, Model model) {
        List<Customer> customers = customerService.list();
        List<Deliverman> delivermans = delivermanService.list();
        Deliver deliver = deliverService.getById(did);
        model.addAttribute("deliver", deliver);
        model.addAttribute("customers", customers);
        model.addAttribute("delivermans", delivermans);
        return "/deliver/update";
    }

    @PostMapping("/saveDeliver")
    public String updateDeliver(Deliver deliver) {
        deliverService.updateById(deliver);
        return "redirect:/delivers";
    }


    @GetMapping("/delDeliver/{bid}")
    public String toDelete(@PathVariable("bid") Integer bid) {
        deliverService.removeById(bid);
        return "redirect:/delivers";
    }
}

