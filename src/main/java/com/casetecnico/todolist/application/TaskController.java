package com.casetecnico.todolist.application;

import com.casetecnico.todolist.domain.model.Task;
import com.casetecnico.todolist.domain.port.in.TaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public ResponseEntity getAll(){
        return ResponseEntity.ok().body(taskService.findAll());
    }

    @GetMapping("/admin")
    public ResponseEntity getAllByAdmin(){
        return ResponseEntity.ok().body(taskService.findAllByAdmin());
    }

    @GetMapping("/status")
    public ResponseEntity getByStatus(){
        return ResponseEntity.ok().body(taskService.findByStatus());

    }

    @PostMapping
    public ResponseEntity createTask(@RequestBody Task task){
        taskService.createTask(task);
        return ResponseEntity.ok().build();
    }
}
