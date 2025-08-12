package com.letsUp.project1;

public class Manager extends Employee {
    private String Department;

    public Manager(int empId, String firstName, String lastName, double salary, String department) {
        super(empId, firstName, lastName, salary);
        this.Department = department;
    }

    public String Department() {
        return Department;
    }

    public void setDepartment(String department) {
        this.Department = department;
    }

    public void manageProject(){
        System.out.println(getFirstName()+" "+getlastName()+" is managing the "+Department+ " Department");
    }
}
