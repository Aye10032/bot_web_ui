package com.aye10032.bot_web_ui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String information(){
        return "information";
    }

}
