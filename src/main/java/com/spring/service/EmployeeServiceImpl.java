package com.spring.service;

import com.spring.dao.EmployeeDAO;
import com.spring.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    /**
     * getAllEmployees use link to DAO-Object to get Objects from DB
     * @return employeeDAO = List of Objects from DB
     */
    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    /**
     * saveEmployee use link DAO-Object for Service-Object to save Objects in DB
     */
    @Override
    @Transactional
    public void saveEmployee(Employee employee) {
        employeeDAO.saveEmployee(employee);
    }
}
