package com.zhaihuilin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhaihuilin on 2018/1/18  14:03.
 */
@RestController
public class LoggerEntityCotroller {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello world test!";
    }

    @RequestMapping("/hello2")
    public String hello2(String name){
        return "Hello "+name+" !";
    }
}
