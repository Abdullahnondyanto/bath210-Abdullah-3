package com.xsis.Day03;

public class Array01{
    public static void main(String[] args) {
        int[][] nums = new int[5][5];
        Array01 arr = new Array01();

        //arr.setBox(nums);
        //arr.setDiagonalLeft(nums);
        arr.setDiagonalRight(nums);
    }

    void setBox(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.printf("%d  ", nums[i][j] = 9);
            }
            System.out.println();
        }
    }

    void setDiagonalRight(int[][] nums) {
        for (int j = 0; j >= 0; j--) {
            for (int i = 0; i < nums[i].length; i++) {
                if (i == j) {
                    System.out.printf("%d  ", nums[i][j] = 9);
                } else {
                    System.out.printf("%d  ", "*");
                }
            }
            System.out.println();
        }
    }
}




