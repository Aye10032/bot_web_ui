package com.aye10032.bot_web_ui.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @program: bot_web_ui
 * @className: Information
 * @Description:
 * @version: v1.0
 * @author: Aye10032
 * @date: 2022/7/28 上午 10:44
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Information {

    private Integer id;
    private String title;
    private String msg;
    private Boolean hasdone;

}
