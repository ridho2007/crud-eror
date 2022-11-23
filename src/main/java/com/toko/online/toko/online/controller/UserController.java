package com.toko.online.toko.online.controller;

import com.toko.online.toko.online.modal.User;
import com.toko.online.toko.online.response.ResponHelper;
import com.toko.online.toko.online.servis.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/User")
public class UserController {
@Autowired
private UserService userService;

    @GetMapping("/all")
    public Object getAllUser(){
        return ResponHelper.ok( userService.getAllUser());

    }
    @GetMapping("/{No}")
    public Object getUser(@PathVariable("No") Long No) {

        return ResponHelper.ok( userService.getUser(No));
    }
    @PostMapping
    public Object addUser(@RequestBody User user) {
        return ResponHelper.ok(userService.addUser(user));
    }
    @PutMapping("/{No}")
    public Object editUserById(@PathVariable("No") Long No, @RequestBody User user) {
        return ResponHelper.ok( userService.editUser(No, user.getUsername(), user.getEmail(), user.getAge(), user.getAdress(), user.getPhoneNumber()));
    }
    @DeleteMapping("/{No}")
    public void deleteUserById(@PathVariable("No") Long No) { userService.deleteUserById(No);}

}
