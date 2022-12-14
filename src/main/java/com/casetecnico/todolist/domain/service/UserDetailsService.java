package com.casetecnico.todolist.domain.service;

import com.casetecnico.todolist.domain.port.out.UserPortOut;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Component;

@Slf4j
@AllArgsConstructor
@Component
public class UserDetailsService implements UserDetailsManager {

    @Autowired
    private final UserPortOut userPortOut;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.info("Buscando na base o usuario = {}", username);
        var user = userPortOut.findByUsername(username);
        if(user == null)
            throw new UsernameNotFoundException("No user found with username" + username);
        log.info("Usuario identificado", username);
        return user;
    }

    @Override
    public void createUser(UserDetails user) {

    }

    @Override
    public void updateUser(UserDetails user) {

    }

    @Override
    public void deleteUser(String username) {

    }

    @Override
    public void changePassword(String oldPassword, String newPassword) {

    }

    @Override
    public boolean userExists(String username) {
        var user =  userPortOut.findByUsername(username);
        if(user == null)
            return false;
        return true;
    }
}