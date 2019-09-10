package com.xsis.Day06;
import java.util.Scanner;
public class Latihan1 {
    Scanner data= new Scanner(System.in);
    public static void main(String[] args) {
        Latihan1 latihan1=new Latihan1();
        latihan1.getData();
        }
        public void getData(){
            System.out.println("Masukkan Data: ");
            int n=data.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i >=j && i <= (n-1)/2) {
                        System.out.print("5");
                    }
                    else if (i<=j && i >= (n-1)/2) {
                        System.out.print("5");
                    }
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
    }
}

