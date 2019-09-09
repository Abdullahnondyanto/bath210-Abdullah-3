package com.xsis.JavaQuiz;

import java.util.Scanner;
   public class JavaLogic9 {
           public static void main(String args[]){

               Scanner input = new Scanner(System.in);

               int angka1;
               int angka2;
               int angka3;
               int angka4;
               int jumlah;

               System.out.print("Score pertama: ");
               angka1 = input.nextInt();

               System.out.print("Score kedua: ");
               angka2 = input.nextInt();

               System.out.print("Score Ketiga: ");
               angka3 = input.nextInt();

               System.out.print("Score Keempat: ");
               angka4 = input.nextInt();
               jumlah = angka1 + angka2 + angka3 + angka4 ;

               System.out.printf( "Jumlah Score: %d", jumlah );

           }

       }






