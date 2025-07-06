package com.example.todotask.Services;

import com.example.todotask.Models.TaskModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoTaskServices {
    List<TaskModel> tasks = new ArrayList<>();

    public String insertTask(TaskModel t) {
         tasks.add(t);
         return "Task Added Successfully";
    }

    public List<TaskModel> getAllTasks(){
        return tasks;
    }

    public TaskModel getTaskById(Long id) {

        for(TaskModel t:tasks){
            if(t.getId() == id){
                return t;
            }
        }
        return null;
    }

    public String updateTask(TaskModel t){
        int ind = 0;
        boolean flag = false;

        for(int i=0;i<tasks.size();i++){
            if(t.getId() == tasks.get(i).getId()){
                ind = i;
                flag = true;
                break;
            }
        }
        if(flag){
            tasks.set(ind,t);
            return "Task updated Successfully";
        }
        else{
            return "Task not Found";
        }
    }


    public String deleteTask(Long id) {
        int ind = 0;
        boolean flag = false;
        for(int i=0;i<tasks.size();i++){
            if(tasks.get(i).getId() == id){
                ind = i;
                flag = true;
            }
        }
        if(flag){
            tasks.remove(ind);
            return "Task deleted Successfully";
        }
        else{
            return "Task not found";
        }
    }
}
