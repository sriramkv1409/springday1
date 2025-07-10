package com.example.springbbootfirst.Repository;

import com.example.springbbootfirst.Models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task,Integer> {
     List<Task> findByEmployeeEmpId(int empId);
}
