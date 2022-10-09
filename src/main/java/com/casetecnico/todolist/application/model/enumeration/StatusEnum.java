package com.casetecnico.todolist.application.model.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum StatusEnum {

    PENDING(1), COMPLETED(2);

    private final int value;
}
