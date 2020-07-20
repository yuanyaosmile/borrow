package com.wm.borrow.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
    private String username;
    private String password;
    private String jobId;

    public User(String jobId) {
        this.jobId = jobId;
    }
}
