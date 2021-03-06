package com.mastery.java.task.rest;

import com.mastery.java.task.dto.Employee;
import com.mastery.java.task.dto.Gender;
import com.mastery.java.task.service.EmployeeService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @GetMapping("/employees")
    @ApiOperation("Read all employees")
    public ResponseEntity<List<Employee>> readAllDepartment()  {
        List<Employee> allEmployee = new ArrayList<>();
        Employee employee= new Employee(1l, "test", "test", "test", "test", Gender.MALE);
        allEmployee.add(employee);
        return new ResponseEntity<>(allEmployee, HttpStatus.OK);
    }
}
