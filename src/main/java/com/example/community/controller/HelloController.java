package com.example.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    /*
    * mu ban yin qing: html -> 模板引擎
    *
    *
    * URL -> dispatherServlet(接待) -> 查表 -> 转发请求到controller -> 调用业务层拿到数据,放到model里面 -> return 模板名字
    * -> dispatherServlet, 转发给模板引擎 -> 模板引擎根据hello作拼接拿到hello.html ->数据填充->  dispatcherServlet -> 返回给前段
    *
    *
    * */

}
