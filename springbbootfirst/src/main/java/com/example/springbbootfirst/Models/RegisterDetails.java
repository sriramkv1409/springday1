package com.example.springbbootfirst.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "user_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;
    @Column(name = "emp_name")
    private String name;
    @Column(nullable = false,unique = true)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(name = "user_name",nullable = false,unique = true)
    private String userName;
    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(name = "user_roles",joinColumns = @JoinColumn(name = "user_id",referencedColumnName = "empId"),
    inverseJoinColumns = @JoinColumn(name = "role_id",referencedColumnName = "roleId"))
    private Set<Roles> roles;

    public void setPassword(String encode) {
        this.password = encode;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }


}

