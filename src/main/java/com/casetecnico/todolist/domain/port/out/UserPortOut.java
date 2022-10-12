package com.casetecnico.todolist.domain.port.out;

import org.springframework.security.core.userdetails.UserDetails;

public interface UserPortOut {
    UserDetails findByUsername(String username);
}
