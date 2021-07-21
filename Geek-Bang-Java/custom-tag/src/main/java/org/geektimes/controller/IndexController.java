package org.geektimes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangya
 * @date 2021-07-07 11:29
 */
@Controller
public class IndexController {

    @GetMapping("/hello")
    public String hello(Model model){
        return "index";
    }
}
