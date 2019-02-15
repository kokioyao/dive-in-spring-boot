package cn.footman.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author kokio
 * @create 2019-01-29 20:13
 */
@Controller
@EnableWebMvc
public class HelloController {


    @RequestMapping("")
    public String index(){
        return "index";
    }

}
