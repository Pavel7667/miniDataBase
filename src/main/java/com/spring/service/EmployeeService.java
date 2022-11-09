package com.spring.service;

import com.spring.entity.Employee;

import java.util.List;

/**
 * Basic interface Service
 */
public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
