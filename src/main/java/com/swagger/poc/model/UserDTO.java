package com.swagger.poc.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserDTO {
    @ApiModelProperty(value = "User identity", position = 0)
    private String id;

    @ApiModelProperty(value = "User name", example = "Jhonzin", required = true, position = 1)
    private String name;
    @ApiModelProperty(value = "Email of user formatted", example = "jhonzin@domain.com.br", required = true , position = 2)
    private String email;
    @ApiModelProperty(value = "Age of user", example = "22", required = true, position = 3)
    private Integer age;
}
