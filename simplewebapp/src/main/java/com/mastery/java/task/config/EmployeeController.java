package com.mastery.java.task.config;

import com.mastery.java.task.dto.Employee;
import com.mastery.java.task.dto.Gender;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
