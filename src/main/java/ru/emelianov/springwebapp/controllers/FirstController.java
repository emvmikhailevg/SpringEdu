package ru.emelianov.springwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/main")
    public String mainPage(@RequestParam(value = "name", required = false) String name,
                           @RequestParam(value = "surname", required = false) String surname) {
        return "first/main_page";
    }

    @GetMapping("goodbye")
    public String goodbyePage() {
        return "first/goodbye_page";
    }
}
