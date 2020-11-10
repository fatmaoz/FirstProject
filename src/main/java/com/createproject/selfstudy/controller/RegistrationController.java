package com.createproject.selfstudy.controller;

import com.createproject.selfstudy.api.CommunicationDTO;
import com.createproject.selfstudy.api.Phone;
import com.createproject.selfstudy.api.UserRegistrationDTO;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class RegistrationController {

    @RequestMapping("/register")
    public String showRegistrationPage(@ModelAttribute("userReg") UserRegistrationDTO userRegistrationDTO){

        Phone phone = new Phone();
        phone.setCountryCode("90");
        phone.setUserNumber("5449494202");

        CommunicationDTO communicationDTO = new CommunicationDTO();
        communicationDTO.setPhone(phone);

        userRegistrationDTO.setCommunicationDTO(communicationDTO);
        return "user-registration-page";
    }

    @RequestMapping("/registiration-sucess")
    public String sucessRegistration(@Valid @ModelAttribute("userReg")UserRegistrationDTO userRegistrationDTO, BindingResult result){

        if (result.hasErrors()){
            System.out.println("My page has error");
            List<ObjectError> allErrors = result.getAllErrors();

            for (ObjectError error : allErrors){
                System.out.println(error);
            }
            return "user-registration-page";
        }
        return "registiration-sucess";
    }
}