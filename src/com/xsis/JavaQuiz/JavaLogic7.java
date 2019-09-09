package com.xsis.JavaQuiz;

public class JavaLogic7 {

    public static void main(String[] args) {
        int a=5;
        for (int b=0;b<=a;b++){
            for (int c=0; c<b; c++) {
                if (b<=a) {
                    System.out.print("*");
                    System.out.print(" ");
                }
            }

            /*for(int c=1; c>=b; c--){
                System.out.print(" ");
            }
            for(int d=1;d<=b;d++){
                System.out.print("*");
            }*/
            System.out.println();
        }
    }
}
