package com.xsis.Day02;

public class ArraySoal {
    public static void main(String[] args) {
        int [][] num = new int[7][7];

        ArraySoal arr = new ArraySoal();

        arr.soal1(num);
    }
    void soal1(int[][] num){
        int i, j;
        int atas = 2;
        int bawah = 44;
        int fix = 3;
        int Kiri1 = 53;
        int Kanan1 = 20;

        for (i = 0; i < num.length; i++) {
            for (j = 0; j < num[i].length; j++) {
                //ATAS
                if (i == 0) {
                    System.out.print(atas);
                    System.out.print(" ");

                    atas += 3;
                    if (j == 2) {
                        System.out.print(fix);
                        System.out.print(" ");
                    }
                }

                // BAWAH
                else if (i == 6
                ) {
                    System.out.print(bawah);
                    System.out.print(" ");

                    bawah -= 3;
                    if (j == 2) {
                        System.out.print(fix);
                        System.out.print(" ");
                    }
                }

                //KIRI
                else if (j == 0) {
                    if (i > 1 && i < 5) {
                        System.out.print(Kiri1);
                        Kiri1 -= 3;
                    }
                    if (i == 1 || i == 5) {
                        System.out.print("3");
                    }
                }

                //KANAN
                else if (j == 6) {
                    if (i > 1 && i < 5) {
                        System.out.print(Kanan1);
                        System.out.print(" ");
                        Kanan1 += 3;
                    }
                    if (i == 1 || i == 5) {
                        System.out.print("3");
                        System.out.print(" ");
                    }
                    break;
                } else {
                    System.out.print(" ");
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
