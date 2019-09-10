package com.xsis.Day06;
import java.util.Scanner;
public class Latihan2 {
    Scanner data = new Scanner(System.in);

    public static void main(String[] args) {
        Latihan2 soal7 = new Latihan2();
        soal7.getData();
    }

    public void getData() {
        System.out.print("Masukkan Data: ");


        int n = data.nextInt();
        int h = 16;
        for (int a = 0; a <= n; a++) {
            for (int b = 0; b < n - a; b++) {
                System.out.print(" *");
            }
        }
        int a=0;
        for (int c = 0; c < a; c++) {
            System.out.println("");
        }
    }
}
