package com.alicode;
import java.util.Arrays;

public class JavaArray {
    void printArray(){
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 12;
        numbers[2] = 6;

        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);

        int[] numbers2 = {10,30,52,12,35};
        System.out.println(Arrays.toString(numbers2));
        numbers2[1] = 85;
        System.out.println(Arrays.toString(numbers2));

        String[] names = {"Ally", "John", "doe"};
        System.out.println(Arrays.toString(names));
    }

}
