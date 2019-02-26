package com.org.cucumber.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class PoopController {
    @RequestMapping(method = {RequestMethod.GET}, value = {"/poop"})
    public String getVersion(HttpServletResponse response) {
        return "poop";
    }
}
