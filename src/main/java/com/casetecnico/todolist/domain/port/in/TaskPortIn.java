package com.casetecnico.todolist.domain.port.in;

import com.casetecnico.todolist.application.StatusEnum;
import com.casetecnico.todolist.domain.model.TaskModel;
import com.casetecnico.todolist.infrastructure.entity.Task;

import java.util.List;
import java.util.Optional;

public interface TaskPortIn {

    List<Task> findByStatus(Optional<String> status);
    List<Task> findAllByAdmin();
    Task createTask(TaskModel taskModel);

}
