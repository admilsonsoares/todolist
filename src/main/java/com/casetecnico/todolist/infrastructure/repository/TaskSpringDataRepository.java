package com.casetecnico.todolist.infrastructure.repository;

import com.casetecnico.todolist.infrastructure.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskSpringDataRepository extends JpaRepository<Task, Long> {
    List<Task> findByStatusName(String status);
}
