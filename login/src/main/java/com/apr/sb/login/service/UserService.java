package com.apr.sb.login.service;

import com.apr.sb.login.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
