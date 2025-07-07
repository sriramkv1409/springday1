package com.example.todotask.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class TaskModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String description;

    private Progress progress;

    public enum Progress {
        YETTOSTART,
        INPROGRESS,
        COMPLETED
    }

//    public TaskModel() {
//    }
//
//    public TaskModel(Long id, String name, String description, Progress progress) {
//        this.id = id;
//        this.name = name;
//        this.description = description;
//        this.progress = progress;
//    }
//
//    //Getters and Setters
//
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public Progress getProgress() {
//        return progress;
//    }
//
//    public void setProgress(Progress progress) {
//        this.progress = progress;
//    }
}
