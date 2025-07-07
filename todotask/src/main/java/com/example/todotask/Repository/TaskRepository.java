package com.example.todotask.Repository;

import com.example.todotask.Models.TaskModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<TaskModel,Integer> {
}
