package com.example.demo.service;

import com.example.demo.dto.UserRequest;
import com.example.demo.entity.User;
import com.example.demo.repostory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(UserRequest userRequest){
        Integer userId = null;
        User user = User.
                build(userId ,
                userRequest.getName(),
                userRequest.getEmail(),
                userRequest.getMobile(),
                userRequest.getGender(),
                userRequest.getAge(),
                userRequest.getNationality());
                return  userRepository.save(user);
    }
    public List <User> getAllUsers(){
        return userRepository.findAll();
    }
    public User getUser(int id){
        return userRepository.findByUserId(id);
    }

}

