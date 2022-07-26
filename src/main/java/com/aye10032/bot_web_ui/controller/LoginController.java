package com.aye10032.bot_web_ui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * @program: bot_web_ui
 * @className: LoginController
 * @Description:
 * @version: v1.0
 * @author: Aye10032
 * @date: 2022/7/26 下午 6:35
 */
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            Model model, HttpSession session) {

        if (username.equals("aye10032") && password.equals("114514")) {
            session.setAttribute("loginuser", username);
            return "redirect:/index.html";
        } else {
            model.addAttribute("msg", "密码错误");
            return "login";
        }
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/";
    }

}
