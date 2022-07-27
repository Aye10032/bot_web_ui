package com.aye10032.bot_web_ui;

import com.aye10032.bot_web_ui.dao.UserDao;
import com.aye10032.bot_web_ui.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BotWebUiApplicationTests {

    @Autowired
    private UserDao dao;

    @Test
    void contextLoads() {
        User user = dao.loadUserByUsername("aye");
        System.out.println(user.toString());
    }

}
