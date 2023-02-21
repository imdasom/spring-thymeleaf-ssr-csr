package com.example.springssrcsr.contollers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/ssr")
    public String ssr(Model model) {
        model.addAttribute("name", "김땡땡");
        model.addAttribute("age", "20");
        return "ssr";
    }

    @RequestMapping("/csr")
    public String csr(Model model) {
        model.addAttribute("name", "김땡땡");
        model.addAttribute("age", "20");
        return "csr";
    }
}
