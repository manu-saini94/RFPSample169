package com.bridgelabz.basics;

public class SumExample {

    // method definition or implementation
    static void sum(){
        int x = 100;
        int y = 200;
        int sum = x+y;
        System.out.println("Sum is = "+sum);
    }

    // Arguments or parameters
    static int multiply(int x,int y){
          int multiplication = x*y;
          return multiplication;
    }

    static void calculator(int data){
        int result = data+45;
        System.out.println("Final =>" +result);
    }

    // JVM => Java Virtual Machine => executing or calling the main method
    public static void main(String[] args) {
        sum();
        int result = multiply(3,7);
        System.out.println("Result =>" +result);
        calculator(result);
        int result2 = multiply(4,8);
        System.out.println("Result2 =>" +result2);
        calculator(result2);

    }

}
