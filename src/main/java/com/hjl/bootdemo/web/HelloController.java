package com.hjl.bootdemo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiale.he
 * @date 2019/04/23
 * @email jiale.he@mail.hypers.com
 */
@RestController
public class HelloController {

    @GetMapping("hello")
//    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String hello() {
        return "hello spring mvc json";
    }
}
