package com.spring.dao;

import com.spring.entity.Employee;

import java.util.List;

/**
 * Basic interface
 */
public interface EmployeeDAO {

    public List<Employee> getAllEmployees();
}
