package com.truong.example.usermanagement.services;

import com.truong.example.usermanagement.dao.models.User;
import com.truong.example.usermanagement.dao.repositories.UserRepository;
import com.truong.example.usermanagement.dto.UserDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImlp implements UserService{
    private UserRepository userRepository;
    public UserServiceImlp(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public UserServiceImlp(){
        super();
    }
    @Override
    public List<UserDTO> getUsers(){
        List<UserDTO> userDTOS = new ArrayList<>();
        List<User> users = userRepository.findAll();
        return userDTOS;
    }
    @Override
    public void createUser(UserDTO userDTO){
        User user = new User();
        user.setUsername(userDTO.getUsername());
        user.setFullname(userDTO.getFullname());
        user.setPassword(userDTO.getPassword());
        userRepository.save(user);
        return;
    }
}
