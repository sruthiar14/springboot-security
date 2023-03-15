package com.myLearnings.security.service;

import com.myLearnings.security.payload.LoginDto;
import com.myLearnings.security.payload.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
}
