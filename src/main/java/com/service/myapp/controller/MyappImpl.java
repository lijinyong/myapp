package com.service.myapp.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-08-15T08:16:29.423Z")

@RestSchema(schemaId = "myapp")
@RequestMapping(path = "/myapp", produces = MediaType.APPLICATION_JSON)
public class MyappImpl {

    @Autowired
    private MyappDelegate userMyappDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userMyappDelegate.helloworld(name);
    }

}
