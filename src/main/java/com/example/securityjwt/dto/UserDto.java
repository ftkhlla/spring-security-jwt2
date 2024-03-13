package com.example.securityjwt.dto;

import com.example.securityjwt.model.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Collection;

@Data
@AllArgsConstructor
public class UserDto {

    private Long id;

    private String username;

    private String email;


}
