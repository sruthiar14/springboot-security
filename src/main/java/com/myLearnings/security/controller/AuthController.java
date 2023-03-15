package com.myLearnings.security.controller;

import com.myLearnings.security.payload.JWTAuthResponseDto;
import com.myLearnings.security.payload.LoginDto;
import com.myLearnings.security.payload.RegisterDto;
import com.myLearnings.security.service.AuthService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    private AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    //multiple url attributes
    @PostMapping(value = {"/login","/signIn"})
    public ResponseEntity<JWTAuthResponseDto> login(@RequestBody LoginDto loginDto){
        String response = authService.login(loginDto);
        JWTAuthResponseDto jwtAuthResponseDto = new JWTAuthResponseDto();
        jwtAuthResponseDto.setAccessToken(response);
        return ResponseEntity.ok(jwtAuthResponseDto);
    }
    @PostMapping(value = {"/register","/signUp"})
    public ResponseEntity<String> register(@RequestBody RegisterDto registerDto){
        String response = authService.register(registerDto);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
//        return new ResponseEntity(response, HttpStatus.OK); **SAME AS ABOVE**
    }
}
