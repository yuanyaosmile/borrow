package com.wm.borrow.web;


import com.wm.borrow.entity.User;
import com.wm.borrow.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("user/{jobId}")
    public ResponseEntity<User> getUserInfo(@PathVariable String jobId) {
        return ResponseEntity.ok(userService.getUserInfo(jobId));
    }
}
