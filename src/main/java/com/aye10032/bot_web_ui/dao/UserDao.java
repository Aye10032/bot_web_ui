package com.aye10032.bot_web_ui.dao;

import com.aye10032.bot_web_ui.entity.Role;
import com.aye10032.bot_web_ui.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @program: bot_web_ui
 * @className: UserDao
 * @Description:
 * @version: v1.0
 * @author: Aye10032
 * @date: 2022/7/27 下午 4:22
 */
@Mapper
public interface UserDao {

    User loadUserByUsername(String username);

    List<Role> getRolesByUid(Integer uid);

}
