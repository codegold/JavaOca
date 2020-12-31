package com.example.springsecurityjpa.services;

import com.example.springsecurityjpa.model.User;
import com.example.springsecurityjpa.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);

    @Override
    UserDetails loadUserByUsername(String s) throws UsernameNotFoundException;
}
