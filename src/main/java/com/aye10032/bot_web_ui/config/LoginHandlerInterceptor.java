package com.aye10032.bot_web_ui.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: bot_web_ui
 * @className: LoginHandler
 * @Description:
 * @version: v1.0
 * @author: Aye10032
 * @date: 2022/7/26 下午 7:38
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object login = request.getSession().getAttribute("loginuser");
        if (login == null) {
            request.setAttribute("msg", "请登录");
            request.getRequestDispatcher("/login.html").forward(request, response);
            return false;
        }else {
            return true;
        }
    }
}
