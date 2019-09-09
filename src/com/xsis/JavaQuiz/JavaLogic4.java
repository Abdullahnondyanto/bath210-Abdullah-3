package com.xsis.JavaQuiz;

import java.util.Scanner;
    public class JavaLogic4 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            float[] angka=new float[6];
            float max=0;
            System.out.println(" Masukan angka ");
            for (int i=0;i<6;i++) {
                System.out.print("angka ke-"+(i+1)+" : ");
                float angkainput =scan.nextFloat();
                angka[i]=angkainput;
            }
            for (int i=0;i<6;i++) {
                if(angka[i]>max){
                    max=angka[i];
                }else {
                    max=max;
                }
            }
            System.out.print("Largest number = "+max);

        }

    }

