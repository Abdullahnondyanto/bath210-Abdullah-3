package com.xsis.Day04;

public class latihan4 {
    public static void main(String[] args) {
        latihan4 lg = new latihan4();
        // lg.soal1(14);
        // lg.Soal2(14);
        //lg.Soal3(7);
        //lg.Soal5(7);
    }

    public void Soal1(int n) {
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
    public void Soal2(int n) {
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
    public void Soal3(int n) {
        int deret = 1;
        for (int i = 0; i <= n; i++) {
            System.out.print(deret + " ");
            deret = deret + 3;
        }
    }
    public void Soal5(int n) {
        int deret = 1;
        int interval = 2;
        for (int i = 0; i <= n; i++) {
            System.out.print(deret + " ");
            deret = deret + 4;
            interval += 1;
            if (interval % 2 == 0) {
                System.out.print("*");
            }
        }
    }
}
