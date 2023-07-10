package com.alicode;

public class Main {
    public static void main(String[] args) {
    //Primitives

        JavaArray javaArrayObj = new JavaArray();
        JavaStrings javaStringsObj = new JavaStrings();
        JavaLoops javaLoopObj = new JavaLoops();
        JavaConditionStatement condObj = new JavaConditionStatement();

        int number1 = 10;
        int number2 = 20;
        int results = number1 + number2;
        System.out.println(results);
        double pi = 3.14;
        boolean isAdult = true;
        char a = 'A';

        javaStringsObj.printString();
        javaArrayObj.printArray();
        javaLoopObj.printLoops();
        javaLoopObj.printArrayName();
        condObj.checkAdult();
    }
}