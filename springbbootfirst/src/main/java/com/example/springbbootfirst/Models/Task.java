package com.example.springbbootfirst.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "tasks")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int taskId;

    private String title;
    private String description;
    private String status;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private RegisterDetails employee;

}
