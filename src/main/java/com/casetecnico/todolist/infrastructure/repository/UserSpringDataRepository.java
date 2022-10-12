package com.casetecnico.todolist.infrastructure.repository;

import com.casetecnico.todolist.infrastructure.entity.Task;
import com.casetecnico.todolist.infrastructure.entity.UserApp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserSpringDataRepository extends JpaRepository<UserApp, Long> {

    Optional<UserApp> findByUsername(String username);

    Optional<UserApp> findByPassword(String password);

}
