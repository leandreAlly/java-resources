package com.alicode;

public class JavaLoops {
    void printLoops(){
        System.out.println("Start Loop");
        for(int i = 0; i<=10; i+=4){
            System.out.println("Hello "+ i);
        }
        System.out.println("End Loop");

    }
    void printArrayName(){
        String[] names = {
                "Ally",
                "John",
                "Doe",
                "Fabrice",
                "Alex",
        };

        for(int i =  names.length-1; i >= 0; i--){
            System.out.println(names[i]);
        }
    }
}
