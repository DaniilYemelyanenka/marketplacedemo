package by.yemelyanenko.marketplace.services;

import by.yemelyanenko.marketplace.entity.User;
import by.yemelyanenko.marketplace.model.MyUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;


public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public MyUserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userService.findUserByUsername(username);
        return user.map(MyUserDetails::new).orElseThrow(() -> new UsernameNotFoundException(username + " not found."));
    }
}
