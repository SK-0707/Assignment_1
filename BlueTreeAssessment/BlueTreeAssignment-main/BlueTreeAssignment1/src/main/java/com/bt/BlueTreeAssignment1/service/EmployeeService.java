package com.bt.BlueTreeAssignment1.service;

import com.bt.BlueTreeAssignment1.model.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee addEmployee(Employee employee);

    public List<Employee> getAllEmployees();

    public boolean deleteEmployee(int employeeId);

    public Employee getEmployee(int employeeId);

    public Employee updateEmployee(Employee employee);
}
