package com.xsis.FilteringTest1;
import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int harga, jumlah, total1,total2, diskon;
        System.out.print("Menu Naruto: ");
        harga = sc.nextInt();
        System.out.print("Jumlah Menu : ");
        jumlah = sc.nextInt();
        System.out.print("Menu Hinata : ");
        harga = sc.nextInt();
        System.out.print("Jumlah Menu : ");
        jumlah = sc.nextInt();
        total1 = jumlah * harga;

        if (total1 >= 30000){
            diskon = total1 * 50/100;
            total1 = total1 - diskon;
            System.out.println("Diskon =50%\n" + total1);
        }
        else if (jumlah >= 50){
            diskon = total1 -((total1*10) / 100);
            System.out.println("Tambahan Ongkir 10%\n Total Bayar = " + total1);
        } else {
            System.out.println("Total Bayar = " + total1);
        }
    }
}
