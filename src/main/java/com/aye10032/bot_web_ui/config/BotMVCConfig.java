package com.aye10032.bot_web_ui.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program: bot_web_ui
 * @className: BotMVCConfig
 * @Description:
 * @version: v1.0
 * @author: Aye10032
 * @date: 2022/7/26 下午 6:24
 */
@Configuration
public class BotMVCConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
    }

}
