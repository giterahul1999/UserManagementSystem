package com.rahulgite.UserManagementSystem.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class UserController {

   Logger LOG = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/user")
    public String getUserName(){
        return "Rahul Gite";
    }

    @GetMapping("/getuser")
    public ResponseEntity<String> getUerNameResponse(){
        LOG.info("This is being printed from /getuser path");
        return ResponseEntity.ok("Rahul Gite ResonseEntity");
    }
}
