package com.alicode;

public class JavaMethod {
    /*
       - Access Modifier
       - Optional static
       - Return type
       - Optional Parameters
       - Method body
       - Optional Return value
     */

    double culculateRentalYield(double income , double priceProperty){
        double annualIncome = income * 12;
        return (annualIncome / priceProperty) * 100;
    }
}
