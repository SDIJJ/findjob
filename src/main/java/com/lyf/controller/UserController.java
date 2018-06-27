package com.lyf.controller;

import com.lyf.model.User;
import com.lyf.service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by fangjiejie on 2018/6/27.
 */
@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImp userServiceImp;
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ResponseEntity<User> login(@RequestBody User user){
        User u=userServiceImp.login(user.getUsername(),user.getPassword());
        if(u!=null){
            return new ResponseEntity<User>(u, HttpStatus.OK);
        }else{
            return new ResponseEntity<User>(HttpStatus.CONFLICT);
        }
    }
}
