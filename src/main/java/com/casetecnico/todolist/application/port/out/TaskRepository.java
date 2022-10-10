package com.casetecnico.todolist.application.port.out;

import com.casetecnico.todolist.application.domain.model.Task;

import java.util.List;
import java.util.Optional;


public interface TaskRepository {

    List<Task> findByStatus();
    List<Task> findAll();
    List<Task> findAllByAdmin();
    Task save(Task task);

}
