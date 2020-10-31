package com.createproject.selfstudy.api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserRegistrationDTO {
    private String name;
    private String userName;
    private char[] password;
    private String  countryName;
    private String []hobbies;
    private String gender;
    private String age;

    private CommunicationDTO communicationDTO;

}