package com.swagger.poc.controller;

import com.swagger.poc.model.UserDTO;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class UserController implements IUserControllerDoc{

    @PostMapping("/user")
    @ApiResponse(code = 500, message = "Unexpected error")
    public String createUser(@RequestBody UserDTO user) {
        return UUID.randomUUID().toString();
    }

    @PutMapping("/user")
    public String changeUser(@RequestBody UserDTO user) {
        return UUID.randomUUID().toString();
    }

    @GetMapping("/user")
    public UserDTO findUser(String uuid) {
        var u = new UserDTO();
        u.setId(uuid);
        u.setAge(18);
        u.setName("Jhonzin");
        u.setEmail("jhonzin@domain.com.br");

        return u;
    }

}
