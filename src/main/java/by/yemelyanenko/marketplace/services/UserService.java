package by.yemelyanenko.marketplace.services;

import by.yemelyanenko.marketplace.entity.User;
import by.yemelyanenko.marketplace.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User addUser(User user){
        return userRepository.save(user);
    }
}
