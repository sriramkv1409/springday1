package com.example.springbbootfirst.Repository;

import com.example.springbbootfirst.Models.RegisterDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisterDetailsRepository extends JpaRepository<RegisterDetails,Integer> {
    RegisterDetails findByEmail(String email);
}
