package com.casetecnico.todolist.domain.port.out;

import com.casetecnico.todolist.domain.model.Task;

import java.util.List;


public interface TaskRepository {

    List<Task> findByStatus();
    List<Task> findAll();
    List<Task> findAllByAdmin();
    Task save(Task task);

}
