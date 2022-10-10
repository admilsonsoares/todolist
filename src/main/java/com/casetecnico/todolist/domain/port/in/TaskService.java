package com.casetecnico.todolist.domain.port.in;

import com.casetecnico.todolist.domain.model.Task;

import java.util.List;

public interface TaskService {

    List<Task> findByStatus();
    List<Task> findAll();
    List<Task> findAllByAdmin();
    Task createTask(Task task);

}
