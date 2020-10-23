package com.createproject.selfstudy.controller;

import com.createproject.selfstudy.api.UserRegistrationDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistrationController {

    @RequestMapping("/register")
    public String showRegistrationPage(@ModelAttribute("userReg") UserRegistrationDTO userRegistrationDTO){

        userRegistrationDTO.setName("Fatma");
        return "user-registration-page";
    }

    @RequestMapping("/registiration-sucess")
    public String sucessRegistration(@ModelAttribute("userRegs")UserRegistrationDTO userRegistrationDTO){

        return "registiration-sucess";
    }
}