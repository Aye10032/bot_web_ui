package com.aye10032.bot_web_ui.controller;

import com.aye10032.bot_web_ui.entity.Information;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @program: bot_web_ui
 * @className: InformationController
 * @Description:
 * @version: v1.0
 * @author: Aye10032
 * @date: 2022/7/28 上午 10:05
 */
@Controller
public class InformationController {

    @RequestMapping({"/information","/"})
    public String information(Model model, HttpSession session){
        Collection<Information> information = new ArrayList<>();
        information.add(new Information(1,"测试","可以SSH打洞也可以直接连，我试过了应该都没问题，这俩都是最高权限，你想加用户什么的可以直接加",true));
        information.add(new Information(2,"测试","可以SSH打洞也可以直接连，我试过了应该都没问题，这俩都是最高权限，你想加用户什么的可以直接加",true));
        information.add(new Information(3,"测试","可以SSH打洞也可以直接连，我试过了应该都没问题，这俩都是最高权限，你想加用户什么的可以直接加",true));
        information.add(new Information(4,"测试","可以SSH打洞也可以直接连，我试过了应该都没问题，这俩都是最高权限，你想加用户什么的可以直接加",true));

        model.addAttribute("information",information);
        session.setAttribute("unread", information.size());
        return "information";
    }

    @RequestMapping("/info/update")
    public String updateInformation(@RequestParam("infoid")Integer id){
        System.out.println(id);
        return "redirect:/information";
    }

}
