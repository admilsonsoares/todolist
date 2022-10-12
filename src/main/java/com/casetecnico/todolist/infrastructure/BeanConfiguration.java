package com.casetecnico.todolist.infrastructure;

import com.casetecnico.todolist.domain.port.in.TaskPortIn;
import com.casetecnico.todolist.domain.port.out.TaskPortOut;
import com.casetecnico.todolist.domain.port.out.UserPortOut;
import com.casetecnico.todolist.domain.service.TaskService;
import com.casetecnico.todolist.domain.service.UserDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.provisioning.UserDetailsManager;

@Configuration
public class BeanConfiguration {

    @Bean
    TaskPortIn taskPortIn (TaskPortOut taskPortOut){
        return new TaskService(taskPortOut);
    }

    @Bean
     UserDetailsManager UserRepository (UserPortOut userPortOut){
        return new UserDetailsService(userPortOut);
    }


}
