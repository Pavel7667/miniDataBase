package com.spring.controller;

import com.spring.entity.Employee;
import com.spring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    /**
     * Method addNewEmployee forward to link "employee_Info"
     * Create new Employee and put information from View -> Model
     *
     * @return link to view
     */
    @RequestMapping("/addNewEmployee")
    public String addNewEmployee(Model model) {

        Employee employee = new Employee();
        model.addAttribute("employee", employee);

        return "employee_Info";
    }

    /**
     * Method saveEmployee take from ViewModel info about Object 'employee'
     * And using employeeService->employeeDAO-> save into DB
     * <p>
     * And redirect to Base site page
     *
     * @return link to Base site page
     */
    @RequestMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.saveEmployee(employee);
        return "redirect:/";
    }

    /**
     * Method updateEmployee take from DB Object by ID
     * Which passing by RequestParam("empID") int id
     * <p>
     * And forward to "employee_Info" View
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/updateInfo")
    public String updateEmployee(@RequestParam("empID") int id, Model model) {
        Employee employee = employeeService.getEmployee(id);
        model.addAttribute("employee", employee);
        return "employee_Info";
    }

}
