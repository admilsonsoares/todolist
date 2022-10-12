package com.casetecnico.todolist.application;

import com.casetecnico.todolist.domain.model.TaskModel;
import com.casetecnico.todolist.domain.port.in.TaskPortIn;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final TaskPortIn taskPortIn;

    public TaskController(TaskPortIn taskPortIn) {
        this.taskPortIn = taskPortIn;
    }

    @GetMapping
    public ResponseEntity getAll(@RequestParam Optional<StatusEnum> status){
        return ResponseEntity.ok().body(
                taskPortIn.findByStatus(status.isPresent()? Optional.of(status.get().name()) : Optional.empty() )
        );
    }

    @GetMapping("/admin")
    public ResponseEntity getAllByAdmin(){
        return ResponseEntity.ok().body(taskPortIn.findAllByAdmin());
    }

    @PostMapping
    public ResponseEntity createTask(@RequestBody TaskModel taskModel){
        taskPortIn.createTask(taskModel);
        return ResponseEntity.ok().build();
    }
}
