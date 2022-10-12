package com.casetecnico.todolist.domain.model;

import com.casetecnico.todolist.infrastructure.entity.Profile;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAppModel {

    private String name;

    private String password;

}
