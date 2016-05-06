package com.lirex.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by vivanova on 4/28/2016.
 */
@Controller
public class HomeController {


    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String homePage() {
         return "hello";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }


}