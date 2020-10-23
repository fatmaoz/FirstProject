package com.createproject.selfstudy.api;

import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserInfoDTO {

    @NotBlank(message = "Username can not be blank")
    private String userName;
    private String crushName;
}

