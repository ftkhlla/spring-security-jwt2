package com.example.securityjwt.dto;

import com.example.securityjwt.model.Role;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;

@Data
public class RegistrationUserDto {

    private String username;

    private String password;
    private String confirmPassword;
    private String email;

}
