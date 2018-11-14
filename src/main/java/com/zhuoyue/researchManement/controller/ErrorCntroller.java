package com.zhuoyue.researchManement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/error")
public class ErrorCntroller {

    private static final String BASE_DIR = "/error/";
    @RequestMapping("/400")
    public String handle1() {
        return BASE_DIR + "400";
    }
    @RequestMapping("/404")
    public String handle2() {
        return BASE_DIR + "404";
    }
    @RequestMapping("/500")
    public String handle3() {
        return BASE_DIR + "500";
    }
}
