package com.example.hello;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {
    private String name = "world";

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "Hello " + this.name);
        return "hello";
    }

    @GetMapping("/name")
    @ResponseBody
    public String getName() {
        return name;
    }

    @PostMapping("/put")
    @ResponseBody
    public void postName(@RequestParam("name") String name) {
        this.name = name;
    }
}