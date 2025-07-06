package com.example.todotask.Controllers;


import com.example.todotask.Models.TaskModel;
import com.example.todotask.Services.TodoTaskServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TodoTaskController {

    @Autowired
    TodoTaskServices tts;

    @PostMapping
    public String insertTask(@RequestBody TaskModel t){
        return tts.insertTask(t);
    }
    
    @GetMapping
    public List<TaskModel> getAllTasks(){
        return tts.getAllTasks();
    }

    @GetMapping("/{id}")
    public TaskModel getTaskById(@PathVariable Long id){
        return tts.getTaskById(id);
    }

    @PutMapping("/{id}")
    public String updateTask(@RequestBody TaskModel t){
        return tts.updateTask(t);
    }

    @DeleteMapping("{id}")
    public String deleteTask(@PathVariable Long id){
        return tts.deleteTask(id);
    }

}
