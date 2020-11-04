package com.sun.hssx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class IndexController {

    @GetMapping("hello")
    public Map<String,Object> retHello(){
        Map<String,Object> map = new HashMap<>();
        map.put("hello","我的第一个springboot");
        return map;
    }
}
//访问路径：localhost/jxcc/hello