package com.casetecnico.todolist.infrastructure.repository.impl;

import com.casetecnico.todolist.domain.port.out.TaskPortOut;
import com.casetecnico.todolist.infrastructure.entity.Task;
import com.casetecnico.todolist.infrastructure.repository.TaskSpringDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component
public class TaskRepository implements TaskPortOut{

    @Autowired
    private TaskSpringDataRepository taskSpringDataRepository;

    @Override
    public List<Task> findAll() {
        return taskSpringDataRepository.findAll();
    }

    @Override
    public List<Task> findByStatus(String status) {
        return taskSpringDataRepository.findByStatusName(status);
    }

    @Override
    public List<Task> findAllByAdmin() {
        return null;
    }

    @Override
    public Task save(Task task) {
        task.setCreatedAt(LocalDateTime.now());
        return null;
    }
}
