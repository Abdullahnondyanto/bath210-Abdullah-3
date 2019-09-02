package com.xsis.Day03;

public class logic2no2 {
        public static void main(String[] args) {
            int n1 = 7;
            int n2 = 3;
            int n3 = 2;
            int indeks[] = new int[n1];
            for (int j = 0; j < indeks.length; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
            for (int i = 0; i < indeks.length; i++) {
                if (i == 1) {
                    n3 *= 3;}
                else if (i >= 1 && i <= 3) {
                    n3 *= 2;}
                 else if (i >= 4 && i <= 5) {
                    n3 /= 2;}
                 else if (i == 6){
                    n3 /= 3;}
                System.out.print(n3+" ");
        }
                System.out.println();
                }
            }






