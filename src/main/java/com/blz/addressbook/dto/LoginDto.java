package com.blz.addressbook.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
@Data
public class LoginDto {
    public String email;

    public String password;

    public LoginDto(String emailID, String password) {
        this.email = emailID;
        this.password = password;

    }
}
