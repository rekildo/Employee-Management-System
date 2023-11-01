package com.rekildo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rekildo.entity.Employee;

public interface EmpRepository extends JpaRepository<Employee, Integer>{

}
