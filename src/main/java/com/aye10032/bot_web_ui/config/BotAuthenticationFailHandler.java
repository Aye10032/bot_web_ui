package com.aye10032.bot_web_ui.config;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program: bot_web_ui
 * @className: BotAuthenticationFailHandler
 * @Description:
 * @version: v1.0
 * @author: Aye10032
 * @date: 2022/7/27 上午 8:57
 */
public class BotAuthenticationFailHandler implements AuthenticationFailureHandler {

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
        request.setAttribute("msg", "登陆失败！");
    }
}
