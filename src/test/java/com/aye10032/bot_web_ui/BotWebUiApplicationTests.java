package com.aye10032.bot_web_ui;

import com.aye10032.bot_web_ui.dao.UserDao;
import com.aye10032.bot_web_ui.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class BotWebUiApplicationTests {

    @Autowired
    private UserDao dao;

    @Test
    void contextLoads() {
        User user = dao.loadUserByUsername("aye");
        System.out.println(user.toString());
    }

    @Test
    void passwordEncodingTest(){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String password = encoder.encode("123");
        System.out.println(password);
    }

}
