package com.aye10032.bot_web_ui.config;

import com.aye10032.bot_web_ui.dao.UserDao;
import com.aye10032.bot_web_ui.entity.Role;
import com.aye10032.bot_web_ui.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import java.util.List;

/**
 * @program: bot_web_ui
 * @className: BotUserDetailService
 * @Description:
 * @version: v1.0
 * @author: Aye10032
 * @date: 2022/7/27 下午 4:35
 */
@Component
public class BotUserDetailService implements UserDetailsService {
    @Autowired
    private UserDao dao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = dao.loadUserByUsername(username);
        if (ObjectUtils.isEmpty(user)) throw new UsernameNotFoundException("用户名不正确");
        List<Role> roles = dao.getRolesByUid(user.getId());
        user.setRoles(roles);
        return user;
    }
}
