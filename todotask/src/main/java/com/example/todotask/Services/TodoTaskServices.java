package com.example.todotask.Services;

import com.example.todotask.Models.TaskModel;
import com.example.todotask.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TodoTaskServices {
    @Autowired
    private TaskRepository taskRepository;
    public String insertTask(TaskModel t) {
         taskRepository.save(t);
         return "Task Added Successfully";
    }

    public List<TaskModel> getAllTasks(){
        return taskRepository.findAll();
    }

    public TaskModel getTaskById(int id) {
        Optional<TaskModel> taskModelOptional = taskRepository.findById(id);
        return taskModelOptional.orElse(null);
    }

    public String updateTask(TaskModel t){
         if(taskRepository.existsById(t.getId())){
             taskRepository.save(t);
             return "Updated Task Successfully";
         }
         else{
             return "Task not Found";
         }
    }


    public String deleteTask(int id) {
         if(taskRepository.existsById(id)){
             taskRepository.deleteById(id);
             return "Task Deleted Successfully";
         }
         else {
             return "Task Not Found";
         }
    }
}
