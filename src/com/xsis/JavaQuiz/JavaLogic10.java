package com.xsis.JavaQuiz;

public class JavaLogic10 {

    public static void main(String[] args) {
        double[] numArray = { 34.5, 80, 115, 44.5 };
        double largest = numArray[0];
        for (double num: numArray) {
            if(largest < num)
                largest = num;
        }
        System.out.format("Largest value = %.2f", largest);
    }


}
