package com.xsis.JavaQuiz;

public class JavaLogic2 {

    public static void main(String[]args){

        int awal=2;
        while (awal<=14){
            int b=0;

            for (int a=2; a<awal; a++){

                if(awal%a==0){

                    b=1;
                }
            }
            if (b!=1){
                System.out.print(awal);
            }
            awal++;
        }
    }
}
