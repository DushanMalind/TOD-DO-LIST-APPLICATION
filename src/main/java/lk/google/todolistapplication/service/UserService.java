package lk.google.todolistapplication.service;

import lk.google.todolistapplication.dto.UserDTO;
import lk.google.todolistapplication.entity.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * `@authority` DUSHAN MALINDA
 * 00:44
 * 09/02/2025
 * ASUS
 * To-Do-List-Application
 * lk.google.todolistapplication.service
 */
public interface UserService {
    int saveUser(UserDTO userDTO);
    User findByEmail(String email);

    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}

