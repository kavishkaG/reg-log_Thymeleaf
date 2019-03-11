package net.guides.springboot.registrationloginspringbootsecuritythymeleaf.services;

import net.guides.springboot.registrationloginspringbootsecuritythymeleaf.dto.UserRegistrationDto;
import net.guides.springboot.registrationloginspringbootsecuritythymeleaf.models.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
