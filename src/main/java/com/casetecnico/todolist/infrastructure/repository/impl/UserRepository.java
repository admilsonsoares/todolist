package com.casetecnico.todolist.infrastructure.repository.impl;

import com.casetecnico.todolist.domain.port.out.UserPortOut;
import com.casetecnico.todolist.infrastructure.repository.UserSpringDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class UserRepository implements UserPortOut {

    @Autowired
    private UserSpringDataRepository userSpringDataRepository;

    @Override
    public UserDetails findByUsername(String username) {
        return userSpringDataRepository.findByUsername(username).get();
    }
}
