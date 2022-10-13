package com.casetecnico.todolist.application;

import com.casetecnico.todolist.domain.model.TaskModel;
import com.casetecnico.todolist.domain.port.in.TaskPortIn;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final TaskPortIn taskPortIn;

    public TaskController(TaskPortIn taskPortIn) {
        this.taskPortIn = taskPortIn;
    }

    @GetMapping
    public ResponseEntity getAll(@RequestParam Optional<StatusEnum> status){
        log.info("Entrada: buscando tasks com filtro = {}", status);
        return ResponseEntity.ok().body(
                taskPortIn.findByStatus(status.isPresent()? Optional.of(status.get().name()) : Optional.empty() )
        );
    }
    @GetMapping("/admin")
    public ResponseEntity getAllByAdmin(){
        return ResponseEntity.ok().body(taskPortIn.findAllByAdmin());
    }

}
