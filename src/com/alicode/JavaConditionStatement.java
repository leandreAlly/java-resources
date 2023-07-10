package com.alicode;

public class JavaConditionStatement {
   void checkAdult(){
       int age = 1;
       boolean isAdult = age >= 18;

       if(isAdult){
           System.out.println("You're an Adult :)");
       }else if(age == 0) {
           System.out.println("Baby :)");
       }else if(age == 1) {
           System.out.println("toddler :)");
       }else{
           System.out.println("Not an Adult :(");
       }
   }
}
