package com.xsis.FilteringTest1;
import java.io.*;

public class Soal4 {
        public static void main (String args [])throws Exception
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int harga_baju,Jumlah_es,bonus,total_item ;
            System.out.println("[——]");
            System.out.println(" Beli5Gratis1" );
            System.out.println("");
            System.out.println("");
            System.out.print(" Jumlah Es Loli Yang Dibeli : ");

            Jumlah_es = Integer.parseInt(br.readLine());

            bonus = Jumlah_es/5;
            total_item = Jumlah_es + bonus ;
            harga_baju = Jumlah_es*1000;
            System.out.println(" Jumlah Bonus : " + bonus);
            System.out.println(" Total Barang Yang Dibawa Pulang : " + total_item  );
            System.out.println(" Harga : " + harga_baju  );
            System.out.println("");
            System.out.println("");
            System.out.println("——");
        }
    }

