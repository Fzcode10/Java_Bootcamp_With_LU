package com.letsUp.project1;

public class UsageEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Faiz", "Ahmad", 56123);
        Employee emp2 = new Employee(2, "Faiyaz", "Ahmad", 55123.90);
        emp1.printEmployeeDetails();
        emp2.printEmployeeDetails();

        Employee emp3 = new Employee();
        emp3.setEmpId(3);
        emp3.setFirstName("Reyaz");
        emp3.setLastName("Rafique");
        emp3.setrSalary(45126.00);
        emp3.printEmployeeDetails();

        Manager manager1 = new Manager(101, "Nahid", "Ali", 45218.00, "Accountant");
        Manager manager2 = new Manager(102, "Faizan", "Reza", 55218.00, "Marketing");
        Developer coder1 = new Developer(201, "Ronan", "Rahman", 52663.00, "Java");
        manager2.manageProject();
        manager1.manageProject();
        coder1.writeCode();
    }
}
