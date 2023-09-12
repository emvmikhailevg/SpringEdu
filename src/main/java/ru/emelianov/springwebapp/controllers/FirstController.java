package ru.emelianov.springwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/main")
    public String mainPage() {
        return "first/main_page";
    }

    @GetMapping("goodbye")
    public String goodbyePage() {
        return "first/goodbye_page";
    }
}
