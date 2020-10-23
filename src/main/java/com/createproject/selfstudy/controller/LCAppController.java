package com.createproject.selfstudy.controller;


import com.createproject.selfstudy.api.UserInfoDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Controller
public class LCAppController {

    @RequestMapping("/")
    public String showTheHomePage(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO){

        return "home-page";
    }

    @RequestMapping("/process-homepage")
    public String showResultPage(@Valid @ModelAttribute("userInfo") UserInfoDTO userInfoDTO, BindingResult result){

        //model.addAttribute("userName",username);
        //model.addAttribute("crushName",crushname);
        //model.addAttribute("userInfo",userInfoDTO);

        if(result.hasErrors()){

            List<ObjectError> allErrors = result.getAllErrors();
            for (ObjectError temp : allErrors){
                System.out.println(temp);
            }

            return "home-page";
        }
        return "result-pager";
    }
}
