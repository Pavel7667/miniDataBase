package com.spring.controller;

import com.spring.dao.EmployeeDAO;
import com.spring.entity.Employee;
import com.spring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyController {

    /**
     * Change connection with DB by Controller -> DAO -> DB
     * to Controller -> Service -> DAO -> DB
     */
    @Autowired
    private EmployeeService employeeService;


    /**
     * RequestMapping("/") = Base site page link
     * Which take Model(Information about Object)
     * List<Employee> = taking from employeeDAO INFO from DB about Objects
     * model.addAttribute = "allEmps" for each object Link
     *
     * @param model (Information about Object)
     * @return link to the same name View
     */
    @RequestMapping("/")
    public String showAllEmployees(Model model) {

        List<Employee> allEmployees = employeeService.getAllEmployees();
        model.addAttribute("allEmps", allEmployees);

        return "allEmployees";
    }

}
