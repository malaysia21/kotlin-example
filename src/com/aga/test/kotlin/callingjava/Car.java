package com.aga.test.kotlin.callingjava;

import org.jetbrains.annotations.Nullable;

import java.util.Arrays;

public class Car {

    public static int staticVariable = 5;

    private String color;
    private String model;
    private Integer year;
    private Object anyObject;


    public Car(String color, String model, Integer year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }

    public @Nullable String getColor() {
        return color;
    }

    public void setColor( String color) {
        this.color = color;
    }

    public  String getModel() {
        return null;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Object getAnyObject() {
        return anyObject;
    }

    public void setAnyObject(Object anyObject) {
        this.anyObject = anyObject;
    }

    public void intArray(int[] array){
        Arrays.stream(array).forEach(System.out::println);
    }

    public void variableMethod(int num, String...strings) {
        Arrays.stream(strings).forEach(System.out::println);
    }

    public void demoMethod(Runnable runnable){
        new Thread(runnable).start();
    }

    public static String staticMethod(){
        return "Static method";
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
