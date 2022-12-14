package com.casetecnico.todolist.domain.service;

import com.casetecnico.todolist.domain.model.TaskModel;
import com.casetecnico.todolist.infrastructure.entity.Task;
import com.casetecnico.todolist.domain.port.in.TaskPortIn;
import com.casetecnico.todolist.domain.port.out.TaskPortOut;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Slf4j
@AllArgsConstructor
@Component
public class TaskService implements TaskPortIn {

    private final TaskPortOut taskPortOut;

    @Override
    public List<Task> findByStatus(Optional<String> status) {
        log.info("Processamento: preparando consulta de tasks com filtro = {} ", status);
        if(status.isPresent())
            return taskPortOut.findByStatus(status.get());
            return taskPortOut.findAll();
    }

    @Override
    public List<Task> findAllByAdmin() {
        return taskPortOut.findAllByAdmin();
    }

    @Override
    public Task createTask(TaskModel taskModel) {
        return taskPortOut.save(new Task(taskModel.getResume(), taskModel.getDescription()));
    }
}
