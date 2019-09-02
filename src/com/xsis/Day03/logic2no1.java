package com.xsis.Day03;

public class logic2no1 {
        public static void main(String[] args) {
            int[][] a = {{0, 0, 0, 0, 0, 0, 0}, {1, 3, 6, 12, 6, 3, 1} };
            int[][] b = {{0, 1, 2, 3, 4, 5, 6}, {1, 3, 6, 12, 6, 3, 1} };
            int[][] Sum = new int[2][7];
            int rows, columns;

            for(rows = 0; rows < a.length; rows++) {
                for(columns = 0; columns < a[0].length; columns++) {
                    Sum[rows][columns] = a[rows][columns] + b[rows][columns];
                }
            }
            System.out.println("Sum Of those Two Arrays are: ");
            for(rows = 0; rows < a.length; rows++) {
                for(columns = 0; columns < a[0].length; columns++) {
                    System.out.format("%d \t", Sum[rows][columns]);
                }
                System.out.println("");
            }
        }
    }

