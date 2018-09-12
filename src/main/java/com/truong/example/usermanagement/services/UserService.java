package com.truong.example.usermanagement.services;

import com.truong.example.usermanagement.dto.UserDTO;

import java.util.List;

public interface UserService {
    List<UserDTO> getUsers();
    void createUser(UserDTO userDTO);
}
