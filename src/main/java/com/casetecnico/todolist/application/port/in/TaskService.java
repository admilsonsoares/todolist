package com.casetecnico.todolist.application.port.in;

import com.casetecnico.todolist.application.domain.model.Task;

import java.util.List;
import java.util.Optional;

public interface TaskService {

    List<Task> findByStatus();
    List<Task> findAll();
    List<Task> findAllByAdmin();
    Task createTask(Task task);

}
