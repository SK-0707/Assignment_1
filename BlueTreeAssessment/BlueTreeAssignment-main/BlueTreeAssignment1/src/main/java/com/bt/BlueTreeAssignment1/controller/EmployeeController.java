package com.bt.BlueTreeAssignment1.controller;

import com.bt.BlueTreeAssignment1.model.Employee;
import com.bt.BlueTreeAssignment1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bluetree/")
@CrossOrigin("*")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
    public  EmployeeController(EmployeeService employeeService){
        this.employeeService=employeeService;
    }

    @GetMapping("/employee")
    public ResponseEntity<?> getaAllEmployees(){
        return new ResponseEntity<>(employeeService.getAllEmployees(), HttpStatus.OK);
    }

    @PostMapping("/employee")
    public ResponseEntity<?> addEmployee(@RequestBody Employee employee){
        return new ResponseEntity<>(employeeService.addEmployee(employee), HttpStatus.CREATED);
    }

    @DeleteMapping("/employee/{empId}")
    public ResponseEntity<?> deleteEmpoyee(@PathVariable int empId){
        return new ResponseEntity<>(employeeService.deleteEmployee(empId), HttpStatus.OK);
    }
}
