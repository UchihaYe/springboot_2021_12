package com.wys.work.controller;


import com.wys.work.entity.Firm;
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
public class FirmController {

    @Autowired
    FirmService firmService;

    @RequestMapping("/firms")
    public String list(Model model) {
        List<Firm> firms = firmService.list();
        model.addAttribute("firms", firms);
        return "firm/list";
    }

    @GetMapping("/firm")
    public String gotoAddPg(Model model) {
        return "/firm/add";
    }

    @PostMapping("/firm")
    public String addFirm(Firm firm) {
        firmService.save(firm);
        return "redirect:/firms";
    }

    @GetMapping("/updateFirm/{fon}")
    public String toUpdate(@PathVariable("fon") String id, Model model) {
        Firm firm = firmService.getById(id);
        model.addAttribute("firm", firm);
        return "/firm/update";
    }

    @PostMapping("/saveFirm")
    public String updateFirm(Firm firm) {
        firmService.updateById(firm);
        return "redirect:/firms";
    }


    @GetMapping("/delFirm/{fon}")
    public String toDelete(@PathVariable("fon") String id) {
        firmService.removeById(id);
        return "redirect:/firms";
    }
}

