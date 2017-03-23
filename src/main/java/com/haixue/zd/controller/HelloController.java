package com.haixue.zd.controller;

import com.haixue.zd.model.User;

/**
 * Created by zengdan on 2017/3/23.
 */
public class HelloController {
    public static void main(String[] args) {
        System.out.println("this is HelloController");
    }

    public void getUserInfo(){
        User user = new User();
        user.setUserName("zengdan");
        user.setUserAge(22);
        System.out.println(user);
    }

    public void change(){
        System.out.println("this is branch change info.");
        System.out.println("merge");
        System.out.println("merge complete...");
    }
}
