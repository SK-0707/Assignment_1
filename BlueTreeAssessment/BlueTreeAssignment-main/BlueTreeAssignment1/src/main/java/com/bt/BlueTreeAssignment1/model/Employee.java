package com.bt.BlueTreeAssignment1.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    int empId;
    String empName;
    String email;
    Date dob;
    int age;
    double salary;
    boolean status;

    public Employee(){}

    public Employee(int empId, String empName, String email, Date dob, int age, double salary, boolean status) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.dob = dob;
        this.age = age;
        this.salary = salary;
        this.status = status;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                ", salary=" + salary +
                ", status=" + status +
                '}';
    }
}
