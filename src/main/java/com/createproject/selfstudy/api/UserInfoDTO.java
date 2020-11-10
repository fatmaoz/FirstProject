package com.createproject.selfstudy.api;

import lombok.*;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserInfoDTO {

    @NotBlank(message = "Username can not be blank")
    @Size(min = 3, max = 25, message = "*your name should have at least 3 character")
    private String userName;

    @NotBlank(message = "Crush name can not be blank")
    @Size(min = 3, max = 25, message = "*crush name should have at least 3 character")
    private String crushName;

    @AssertTrue(message = "you have to aggree to use our app")
    private boolean termAndCondition;

}

