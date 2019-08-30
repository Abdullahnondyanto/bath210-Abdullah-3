package com.xsis.Day02;

public class logic1no5 {
    public static void main(String[] args) {


        int a = 1;
        int b = 2;
        for (int i = 0; i <= 7; i++) {
            System.out.print(a + " ");
            a = a + 4;
            b += 1;
            if (b % 2 == 0) {
                System.out.print("*");
            }
        }
    }}
