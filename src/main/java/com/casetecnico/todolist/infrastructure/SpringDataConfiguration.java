package com.casetecnico.todolist.infrastructure;

import com.casetecnico.todolist.infrastructure.repository.impl.AuthorityRepository;
import com.casetecnico.todolist.infrastructure.repository.impl.TaskRepository;
import com.casetecnico.todolist.infrastructure.repository.impl.UserRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackageClasses = {TaskRepository.class, UserRepository.class, AuthorityRepository.class})
public class SpringDataConfiguration {
}
