package com.digrazia.NoSQLDemo.business.API.controller;


import com.digrazia.NoSQLDemo.business.API.UserAPI;
import com.digrazia.NoSQLDemo.business.model.domain.User;
import com.digrazia.NoSQLDemo.business.model.dto.CreateUserDTO;
import com.digrazia.NoSQLDemo.business.model.dto.CreatedUserDTO;
import com.digrazia.NoSQLDemo.business.model.dto.UserDTO;
import com.digrazia.NoSQLDemo.business.service.UserService;
import com.digrazia.NoSQLDemo.integration.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController implements UserAPI {

    UserService userService;
    UserMapper userMapper;

    @Autowired
    public UserController(UserService userService, UserMapper userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @Override
    @PostMapping
    public CreatedUserDTO createUser(@RequestBody CreateUserDTO createUserDTO) {
        User userToCreate = User.userCreation(createUserDTO);

        User createdUser = userService.createUser(userToCreate);

        return userMapper.fromUserToCreatedUserDTO(createdUser);
    }

    @Override
    @GetMapping("/{id}")
    public UserDTO findById(@PathVariable("id") String id) {
        User user = userService.findById(id);

        return userMapper.fromUserToUserDTO(user);
    }


}
