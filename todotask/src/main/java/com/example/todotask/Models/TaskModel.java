package com.example.todotask.Models;

public class TaskModel {
    private Long id;

    private String name;

    private String description;

    private Progress progress;

    public enum Progress {
        YETTOSTART,
        INPROGRESS,
        COMPLETED
    }

    public TaskModel() {
    }

    public TaskModel(Long id, String name, String description, Progress progress) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.progress = progress;
    }

    //Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Progress getProgress() {
        return progress;
    }

    public void setProgress(Progress progress) {
        this.progress = progress;
    }
}
