package com.alicode;

public class JavaConditionStatement {
   void checkAdult(){
       int age = 18;
       boolean isAdult = age >= 18;

       if(isAdult){
           System.out.println("You're an Adult :)");
       }else{
           System.out.println("Not an Adult :(");
       }
   }
}
