package com.aga.test.kotlin.callingkotlin;

import java.io.IOException;

public class CallingKotlinFromJava {

    public static void main(String[] args) {

        //calling top level function
        StaticCar.topLevelFunction();

        //calling extension function
        StaticCar.stringExtensionFunction("Test");

        //calling properties
        Car car = new Car("blue", "Audi", 2017, true);
        System.out.println(car.getModel());
        car.setColor("orange");
        System.out.println(car.getColor());
        System.out.println(car.isAutomatic());
        System.out.println(car.year);

        //companion object
        Car.Companion.carCompanion();
        //companion object - works if @JvmStatic added
        Car.carCompanion();

        //calling singleton object
        SingletonObject.INSTANCE.doSomething();

        //calling singleton object - works if @JvmStatic added
        SingletonObject.doSomething();
        System.out.println("is Auto: " + Car.isAuto);
        System.out.println("Constant: " + Car.constant);

        //passing null object to non null function in kotlin
        car.functionWithNotNullParameter("print");
        //car.functionWithNotNullParameter(null);

        //function in kotlin throwing exception

        try {
            car.functionThrowingException();
        } catch (IOException e) {
            System.out.println("IO Exception");
        }

        //calling function with default parameter
        car.functionWithDefaultValues("Test");
    }
}
