package com.trustmeenglish.core.controllers;

import com.trustmeenglish.core.dto.UserDTO;
import com.trustmeenglish.core.mappers.UserMapper;
import com.trustmeenglish.core.model.User;
import com.trustmeenglish.core.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final UserMapper userMapper;

    @GetMapping("/users/{id}")
    public UserDTO sayHello(@PathVariable Long id){
        User user = userService.getUser(id);
        return userMapper.toDTO(user);
    }
}
