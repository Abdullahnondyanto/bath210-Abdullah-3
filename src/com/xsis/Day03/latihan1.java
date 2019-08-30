package com.xsis.Day03;

public class latihan1 {
    public static void main(String[]args){
        int h=1, p=17,c=1,n=2;
        for (int i= 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print(h);
                    h++;
                    h++;
                } else if (i + j == n - 1)
                {
                    if (p!=9) {
                        System.out.print(p);
                        p--;
                        p--;
                    }
                    else
                    System.out.print("  ");
                }
                System.out.println();
            }
        }
    }
}
