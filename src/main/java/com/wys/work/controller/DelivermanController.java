package com.wys.work.controller;



import com.wys.work.entity.Customer;
import com.wys.work.entity.Deliverman;
import com.wys.work.entity.Firm;
import com.wys.work.service.DelivermanService;

import com.wys.work.service.FirmService;
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
public class DelivermanController {

    @Autowired
    DelivermanService delivermanService;
    @Autowired
    FirmService firmService;

    @RequestMapping("/delivermans")
    public String list(Model model) {
        List<Deliverman> delivermans = delivermanService.getFname();
        List<Firm> firms = firmService.list();
        model.addAttribute("firms",firms);
        model.addAttribute("delivermans", delivermans);
        return "deliverman/list";
    }

    @GetMapping("/deliverman")
    public String gotoAddPg(Model model) {
//        List<Deliverman> delivermans = delivermanService.list();
        List<Firm> firms = firmService.list();
        model.addAttribute("firms",firms);
//        model.addAttribute("delivermans",delivermans);
        return "/deliverman/add";
    }

    @PostMapping("/deliverman")
    public String addDeliverman(Deliverman deliverman) {
        delivermanService.save(deliverman);
        return "redirect:/delivermans";
    }

    @GetMapping("/updateDeliverman/{dno}")
    public String toUpdate(@PathVariable("dno") Integer dno, Model model) {
        Deliverman deliverman = delivermanService.getById(dno);
        List<Firm> firms = firmService.list();
        model.addAttribute("deliverman", deliverman);
        model.addAttribute("firms", firms);
        return "/deliverman/update";
    }

    @PostMapping("/saveDeliverman")
    public String updateDeliverman(Deliverman deliverman) {
        delivermanService.updateById(deliverman);
        return "redirect:/delivermans";
    }


    @GetMapping("/delDeliverman/{dno}")
    public String toDelete(@PathVariable("dno") String dno) {
        delivermanService.removeById(dno);
        return "redirect:/delivermans";
    }
}

