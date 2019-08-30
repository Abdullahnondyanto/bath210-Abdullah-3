package com.xsis.Day03;

public class Array03 {
    public static void main(String[] args) {
        int[][] nums = new int[5][5];
        Array03 arr = new Array03();

        //arr.setBox(nums);
        //arr.setDiagonalLeft(nums);
        arr.setDiagonalRight(nums);
    }

    void setBox(int[][]nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.printf("%d  ", nums[i][j] = 9);
            }
            System.out.println();
        }
    }

    void setDiagonalRight(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length -1; j > 0; j--) {
                System.out.printf("%d  ", nums[i][j] = 9);
            }
            System.out.println();
        }
    }

}






