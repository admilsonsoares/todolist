package com.casetecnico.todolist.infrastructure;

import com.casetecnico.todolist.domain.port.in.TaskPortIn;
import com.casetecnico.todolist.domain.port.out.TaskPortOut;
import com.casetecnico.todolist.domain.service.DomainTaskService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    TaskPortIn taskPortIn (TaskPortOut taskPortOut){
        return new DomainTaskService(taskPortOut);
    }
}
