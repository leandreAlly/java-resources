package com.alicode;

public class Main {
    public static void main(String[] args) {
    //Primitives

        JavaArray javaArrayObj = new JavaArray();
        JavaStrings javaStringsObj = new JavaStrings();
        JavaLoops javaLoopObj = new JavaLoops();
        JavaConditionStatement condObj = new JavaConditionStatement();
        JavaMethod methodObj = new JavaMethod();

        int number1 = 10;
        int number2 = 20;
        int results = number1 + number2;
        System.out.println(results);
        double pi = 3.14;
        boolean isAdult = true;
        char a = 'A';

        double rentYield =  Math.round(methodObj.culculateRentalYield(1_300, 250_000));
        System.out.println("Rental Yield: "+rentYield);

        javaStringsObj.printString();
        javaArrayObj.printArray();
        javaLoopObj.printLoops();
        javaLoopObj.printArrayName();
        condObj.checkAdult();

    }
}