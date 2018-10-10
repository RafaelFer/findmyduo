package br.com.findmyduo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.misc.Contended;

/**
 * Created by user on 19/09/2018.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String init(){
        System.out.println("passou");
        return "index";
    }

}
