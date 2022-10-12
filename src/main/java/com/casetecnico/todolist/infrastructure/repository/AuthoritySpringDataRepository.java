package com.casetecnico.todolist.infrastructure.repository;

import com.casetecnico.todolist.infrastructure.entity.AuthGrantedAuthority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthoritySpringDataRepository extends JpaRepository<AuthGrantedAuthority, Long> {
}
