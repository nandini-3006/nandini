package com.nandini.store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
        @RequestMapping("/")
    public String indes(){
            return "index.html";
        }
}
