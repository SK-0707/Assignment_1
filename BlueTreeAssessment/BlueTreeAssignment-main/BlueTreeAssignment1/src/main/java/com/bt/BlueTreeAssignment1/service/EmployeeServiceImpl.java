package com.bt.BlueTreeAssignment1.service;

import com.bt.BlueTreeAssignment1.Repository.EmployeeRepo;
import com.bt.BlueTreeAssignment1.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    public EmployeeServiceImpl(EmployeeRepo employeeRepo){
        this.employeeRepo=employeeRepo;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    @Override
    public boolean deleteEmployee(int employeeId) {
        if(employeeRepo.existsById(employeeId)){
            employeeRepo.deleteById(employeeId);
            return true;
        }
        return false;
    }

    @Override
    public Employee getEmployee(int employeeId) {
        return employeeRepo.getById(employeeId);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        Employee emp=this.getEmployee(employee.getEmpId());

        return this.addEmployee(emp) ;
    }
}
