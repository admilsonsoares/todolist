package com.casetecnico.todolist.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TaskModel {
    private String resume;
    private String description;
}
