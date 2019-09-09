package com.xsis.JavaQuiz;

import java.util.Scanner;

public class JavaLogic1 {
    public static void main(String[] args) {
        Scanner scanCash = new Scanner(System.in);
        System.out.println("masukan harga barang ");
        double harga = scanCash.nextDouble();
        System.out.println("masukan uang anda ");
        double cash = scanCash.nextDouble();

        if (cash<harga){
            double kurang=harga - cash;
            System.out.println("Uang tidak cukup "+kurang);
        } else {
            double kembalian = cash - harga;
            System.out.println("Harga Produk : "+harga);
            System.out.println("Cash : "+cash);
            System.out.println("Kembalian : "+kembalian);
        }
    }

}
