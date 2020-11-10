package com.createproject.selfstudy.api;

import com.createproject.selfstudy.validator.Age;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

    @Age(lower = 30 , upper = 75 )
    private Integer age;

    private CommunicationDTO communicationDTO;

}