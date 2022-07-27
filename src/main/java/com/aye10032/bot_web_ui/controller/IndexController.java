package com.aye10032.bot_web_ui.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: bot_web_ui
 * @className: IndexController
 * @Description:
 * @version: v1.0
 * @author: Aye10032
 * @date: 2022/7/25 下午 7:18
 */

@Controller
public class IndexController {

    @RequestMapping({"/index","/"})
    public String index(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        System.out.println(authentication.getPrincipal());
        System.out.println(authentication.getAuthorities());
        return "index";
    }

}
