package com.lirex.controllers;

import com.lirex.model.User;
import com.lirex.repository.UserRepository;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by vivanova on 4/28/2016.
 */
@Log
@Controller
public class HomeController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String homePage() {
         return "hello";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String index(@Valid @ModelAttribute(value="user") User user, BindingResult result, Model model) {
        model.addAttribute("user", user);


        if (result.hasErrors()) {
        log.info("alabalaportokala");
            return "redirect:/login";
        }
        userRepository.save(user);

        return "redirect:/login";
    }


}