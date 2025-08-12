package com.letsUp.project1;

public class Employee {
    private int empId ;
    private  String firstName;
    private  String lastName;
    private  double salary;

    //Default Constructor
    public Employee(){

    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getrSalary(){
        return salary;
    }

    public void setrSalary(double rSalary){
        this.salary =   rSalary;
    }

    public Employee(int empId, String firstName, String lastName, double salary) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public void printEmployeeDetails() {
         System.out.println("*************************");
         System.out.println("Employee ID: " + empId);
         System.out.println("First Name: " + firstName+" "+ lastName);
         System.out.println("Salary: " + salary);
    }




}
