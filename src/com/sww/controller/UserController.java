package com.sww.controller;

import com.sww.model.UserInfo;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/4/19 0019.
 */

@Controller
@RequestMapping(value = "/")
public class UserController {


    private static final Log log = LogFactory.getLog(UserController.class);

    private static List<UserInfo> userList;

    public UserController() {
        userList = new ArrayList<UserInfo>();
    }


    @RequestMapping(value = "registerForm", method = RequestMethod.POST)
    public String register(@ModelAttribute UserInfo user, Model model) {


        userList.add(user);
        for (UserInfo user1 : userList
                ) {
            log.info(user1.getUsername());

        }
        model.addAttribute("user", user);
        model.addAttribute("msg", "RegisterForm Success！ please login again ！");

        return "login";
    }


}
