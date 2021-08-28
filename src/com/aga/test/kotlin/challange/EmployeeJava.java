package com.aga.test.kotlin.challange;

public class EmployeeJava {

     private String firstName;
     private String lastName;
     private int startYear;
     private float[] salaryLast3Year;

    public EmployeeJava(String firstName, String lastName, int startYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.startYear = startYear;
        this.salaryLast3Year = new float[3];
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float[] getSalaryLast3Year() {
        return salaryLast3Year;
    }

    public void setSalaryLast3Year(float[] salaryLast3Year) {
        this.salaryLast3Year = salaryLast3Year;
    }
}
