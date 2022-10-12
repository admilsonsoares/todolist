package com.casetecnico.todolist.infrastructure;

import com.casetecnico.todolist.infrastructure.repository.TaskRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackageClasses = TaskRepository.class)
public class SpringDataConfiguration {
}
