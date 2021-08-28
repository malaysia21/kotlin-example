package com.aga.test.kotlin.challange;

public class Challenge6 {
    public static void main(String[] args) {
        KotlinStuff.sayHelloToJava("Student");

        Employee employee = new Employee("John", "Smith", 2010);
        employee.startYear = 2011;

        Challenge.doSomething(45, 67);

        employee.takesDefault("param1");
    }
}
