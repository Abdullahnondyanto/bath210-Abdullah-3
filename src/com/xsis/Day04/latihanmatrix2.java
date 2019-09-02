package com.xsis.Day04;

public class latihanmatrix2 {
        public static void main(String[] args) {
            int[][] matrix = new int [5][5];
            for (int i=0;i<matrix.length;i++){
                for (int j=0;j<matrix.length;j++) {
                    if (i == j) {
                        System.out.print(i+1+" ");
                    } else if (i>j) {
                        System.out.print("* ");
                    } else {
                        System.out.print(0 + " ");
                    }
                }
                System.out.println();
            }
        }
    }
