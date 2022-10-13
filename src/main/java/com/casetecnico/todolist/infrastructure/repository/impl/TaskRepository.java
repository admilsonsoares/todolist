package com.casetecnico.todolist.infrastructure.repository.impl;

import com.casetecnico.todolist.domain.port.out.TaskPortOut;
import com.casetecnico.todolist.infrastructure.entity.Task;
import com.casetecnico.todolist.infrastructure.repository.TaskSpringDataRepository;
import lombok.extern.slf4j.Slf4j;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@Component
public class TaskRepository implements TaskPortOut{

    @Autowired
    private TaskSpringDataRepository taskSpringDataRepository;

    @Override
    public List<Task> findAll() {
        var tasks = taskSpringDataRepository.findAll();
        log.info("Saída: quantidade de tasks encontradas (sem filtro) = {}", tasks.size());
        return tasks;
    }

    @Override
    public List<Task> findByStatus(String status) {
        var tasks = taskSpringDataRepository.findByStatusName(status);
        log.info("Saída: quantidade de tasks com filtro ({}) : {} ", status, tasks.size());
        return tasks;
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
