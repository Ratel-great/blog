package com.demonwang.blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: blog
 * @Date: 2019/2/23 17:58
 * @Author: Mr.Wang
 * @Description:
 */
@RestController
public class HelloContronller {
    @RequestMapping("/hello")
    public String hello(){
      return "hello world!";
    }
}
