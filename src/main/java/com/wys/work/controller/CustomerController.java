package com.wys.work.controller;



import com.wys.work.entity.Customer;
import com.wys.work.service.CustomerService;
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
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping("/customers")
    public String list(Model model) {
        List<Customer> customers = customerService.list();
        model.addAttribute("customers", customers);
        return "customer/list";
    }

    @GetMapping("/customer")
    public String gotoAddPg(Model model) {
        return "/customer/add";
    }

    @PostMapping("/customer")
    public String addCustomer(Customer customer) {
        customerService.save(customer);
        return "redirect:/customers";
    }

    @GetMapping("/updateCustomer/{cno}")
    public String toUpdate(@PathVariable("cno") String cno, Model model) {
        Customer customer = customerService.getById(cno);
        model.addAttribute("customer", customer);
        return "/customer/update";
    }

    @PostMapping("/saveCustomer")
    public String updateCustomer(Customer customer) {
        customerService.updateById(customer);
        return "redirect:/customers";
    }


    @GetMapping("/delCustomer/{cno}")
    public String toDelete(@PathVariable("cno") String cno) {
        customerService.removeById(cno);
        return "redirect:/customers";
    }
}

