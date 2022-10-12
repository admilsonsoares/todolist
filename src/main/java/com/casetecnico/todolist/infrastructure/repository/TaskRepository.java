package com.casetecnico.todolist.infrastructure.repository;

import com.casetecnico.todolist.domain.port.out.TaskPortOut;
import com.casetecnico.todolist.infrastructure.entity.Status;
import com.casetecnico.todolist.infrastructure.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Component
public class TaskRepository implements TaskPortOut{

    @Autowired
    private SpringDataRepository springDataRepository;

    @Override
    public List<Task> findAll() {
        return springDataRepository.findAll();
    }

    @Override
    public List<Task> findByStatus(String status) {
        return springDataRepository.findByStatusName(status);
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
