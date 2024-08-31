package com.dropearn.earndropapi.controller;

import com.dropearn.earndropapi.Entity.userEntity;
import com.dropearn.earndropapi.service.userService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class loginController {

    private final userService service;

    public loginController(userService service) {
        this.service = service;
    }


    @GetMapping("/user/{email}")
    public userEntity user(@PathVariable("email") String email) {
        return service.getuserbyEmail(email);
    }
    @GetMapping("/getAllUser")
    public List<userEntity> getAllUser() {
        return service.getallUser();
    }
    @PostMapping(path = "user")
    public userEntity createNewUser(@RequestBody userEntity user) {
        return service.createNewUser(user);
    }
    @GetMapping("isExist")
    public boolean isExist(@RequestParam String email) {
        return service.isExist(email);
    }

    @GetMapping("delete/{id}")
    public String deleteUser(@PathVariable("id") Integer id) {
        return service.deleteUserByEmail(id);
    }



}
