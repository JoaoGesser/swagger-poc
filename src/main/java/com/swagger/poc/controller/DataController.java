package com.swagger.poc.controller;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {


    @GetMapping(value = "/data")
    @ApiOperation(
            value = "This is a default data endpoint",
            notes = "An endpoint to show how works the documentation with swagger, this example use @OpenAPIDefinition"
    )
    @ApiResponse(code = 200, message = "Return a string with information about data", examples = @Example(@ExampleProperty("A lot of data")))
    public String data() {
        return "A lot of data";
    }
}
