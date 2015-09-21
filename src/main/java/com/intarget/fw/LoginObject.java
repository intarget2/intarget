package com.intarget.fw;

public class LoginObject {
    private final String email;
    private final String password;

    public LoginObject(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
