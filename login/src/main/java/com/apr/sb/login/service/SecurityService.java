package com.apr.sb.login.service;

public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
