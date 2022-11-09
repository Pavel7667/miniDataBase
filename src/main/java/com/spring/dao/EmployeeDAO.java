package com.spring.dao;

import com.spring.entity.Employee;

import java.util.List;

/**
 * Basic interface DAO
 */
public interface EmployeeDAO {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    Employee getEmployee(int id);
}
