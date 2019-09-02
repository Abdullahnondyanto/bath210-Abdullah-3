package com.xsis.Day02;

import java.util.Scanner;

public class Latihanlogic {
    public static void main(String[] args) {
        Latihanlogic lg = new Latihanlogic();
        // lg.soal1(14);
        // lg.Soal2(14);
        //lg.Soal3(7);
        //lg.Soal5(7);
        lg.Soal6(10);
        //lg.Soal7(7);
    }
    public void Soal1(int n){
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0){
                System.out.print(i+" ");
            }
        }
    }
    public void Soal2(int n){
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0){
                System.out.print(i+" ");
            }
        }
    }

    public void Soal3(int n){
        int deret = 1;
        for (int i = 0; i <= n; i++) {
            System.out.print(deret+" ");
            deret = deret +3;
        }
    }

    public void Soal5(int n){
        int deret = 1;
        int interval = 2;
        for (int i = 0; i <= n ; i++) {
            System.out.print(deret+" ");
            deret = deret +4;
            interval +=1;
            if (interval % 2==0){
                System.out.print("*");
            }
        }
    }

    public void Soal6(int n){
        int min =4;
        int max =8;
        int interval=2;
        int deret = 1;
        for (int i = 0; i <= n ; i++) {
            System.out.print(deret+" ");
            interval +=1;
            if (interval % 2==0){
                System.out.print("*");
                deret = deret+ max;
            }else{
                deret = deret+ min;
            }
        }
    }

    public void Soal7(int n){
        int j = 2;
        for (int i = 0; i <= n ; i++) {
            System.out.print(j+ " ");
            j = j * 2;
        }
    }
}