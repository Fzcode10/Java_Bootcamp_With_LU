package com.letsUp.project1;

public class Developer extends Employee {
    private String progLang;

    public String progLang() {
        return progLang;
    }

    public void setProgLang(String progLang) {
        this.progLang = progLang;
    }

    public Developer(int empId, String firstName, String lastName, double salary, String progLang) {
        super(empId, firstName, lastName, salary);
        this.progLang = progLang;
    }

    public void writeCode(){
        System.out.println(getFirstName()+" "+getlastName()+" is coding in "+ progLang+ " language");
    }


    public void printData(){
        System.out.println("Code in "+progLang+ " in our project ");
    }
}
