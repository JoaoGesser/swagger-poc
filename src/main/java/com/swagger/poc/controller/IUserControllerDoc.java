package com.swagger.poc.controller;

import com.swagger.poc.model.UserDTO;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RequestBody;

public interface IUserControllerDoc {
    @ApiOperation(
            value = "This is an endpoint to create new user",
            notes = "Is very important pass the correct information to create a new user, once created the endpoint will return the UUID generated from this operation"
    )
    @ApiResponse(code = 500, message = "Unexpected error")
    String createUser(UserDTO user);
    @ApiOperation(
            value = "This is an endpoint to change or create a new user",
            notes = "Is very important pass the correct information to create a new user or change. If in the payload was informed the UUID this endpoint will try to find the user and update it"
    )
    @ApiResponse(code = 200, message = "Return success when the data is correct", examples = @Example(@ExampleProperty(value = "{cf427bfc-d311-4cbd-8e07-3b3f2b57028a}", mediaType = "application/json")))
    String changeUser(@RequestBody UserDTO user);
    @ApiOperation(
            value = "This is an endpoint to find the user in the system",
            notes = "Is necessary the UUID to find the user, once found the api will return a UserDTO with all information about the user"
    )
    UserDTO findUser(@ApiParam(value = "UUID to find the correspondent user", required = true) String uuid);
}
