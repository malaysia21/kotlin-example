package com.aga.test.kotlin.basics;

public class DummyClass {
    public String isVacationTime(boolean isVacation){
        return isVacation? "Vacation" : "Work";
    }

    public String isVacationTimeSecond(Boolean isVacation){
        return isVacation? "Vacation" : "Work";
    }

    public void printNumbers(int[] array){
        for(int number: array){
            System.out.println(number);
        }
    }
}
