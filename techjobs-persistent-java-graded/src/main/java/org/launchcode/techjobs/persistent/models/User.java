package org.launchcode.techjobs.persistent.models;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.Entity;

@Entity
public class User extends AbstractEntity {



    public  String username;

    public String pwHash;

    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public User(){}


    public User (String username, String password){
        this.username = username;
        this.pwHash = encoder.encode(password);
    }

    public boolean isMatchingPassword(String password) {
        return encoder.matches(password, pwHash);
    }




    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return pwHash;
    }

    public void setPassword(String password) {
        this.pwHash = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }





}
