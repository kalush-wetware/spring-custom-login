package net.kalush.customlogin.service;

import net.kalush.customlogin.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;


public interface UserService extends UserDetailsService {

    User findByEmail(String email);
    
    void save(User user);
    
}
