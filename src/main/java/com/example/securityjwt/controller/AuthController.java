package com.example.securityjwt.controller;

import com.example.securityjwt.dto.JwtRequest;
import com.example.securityjwt.dto.JwtResponse;
import com.example.securityjwt.dto.RegistrationUserDto;
import com.example.securityjwt.dto.UserDto;
import com.example.securityjwt.exception.AppError;
import com.example.securityjwt.model.User;
import com.example.securityjwt.service.AuthService;
import com.example.securityjwt.service.UserService;
import com.example.securityjwt.utils.JwtTokenUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/auth")
    public ResponseEntity<?> createAuthToken(@RequestBody JwtRequest authRequest) {
        return authService.createAuthToken(authRequest);

    }

    @PostMapping("/registration")
    public ResponseEntity<?> createNewUser(@RequestBody RegistrationUserDto registrationUserDto) {
        return authService.createNewUser(registrationUserDto);

    }
}
