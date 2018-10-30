package com.proj.eBuyApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {

    @RequestMapping(value = "/")
    public String homePage(Model model) {
        return "welcome";
    }
}
