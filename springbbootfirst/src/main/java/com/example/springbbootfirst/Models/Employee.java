package com.example.springbbootfirst.Models;

import lombok.Data;

@Data
public class Employee {
    private int eid;
    private String name;
    private String job;

    public Employee(int eid, String name, String job) {
        this.eid = eid;
        this.name = name;
        this.job = job;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}

