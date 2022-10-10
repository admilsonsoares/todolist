package com.casetecnico.todolist.application.domain.service;

import com.casetecnico.todolist.application.domain.model.Task;
import com.casetecnico.todolist.application.port.in.TaskService;
import com.casetecnico.todolist.application.port.out.TaskRepository;

import java.util.List;

public class DomainTaskService implements TaskService {

    private final TaskRepository taskRepository;

    public DomainTaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public List<Task> findByStatus() {
        return taskRepository.findByStatus();
    }

    @Override
    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    @Override
    public List<Task> findAllByAdmin() {
        return taskRepository.findAllByAdmin();
    }

    @Override
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }
}
