package com.casetecnico.todolist.domain.port.out;

import com.casetecnico.todolist.infrastructure.entity.Status;
import com.casetecnico.todolist.infrastructure.entity.Task;

import java.util.List;
import java.util.Optional;


public interface TaskPortOut {

    List<Task> findAll();
    List<Task> findByStatus(String status);
    List<Task> findAllByAdmin();
    Task save(Task task);

}
