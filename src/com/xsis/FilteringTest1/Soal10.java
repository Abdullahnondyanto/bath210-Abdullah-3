package com.xsis.FilteringTest1;
public class Soal10 {
    public static void main(String[] args) {
        Soal10 lg = new Soal10();
       // lg.Soal2(8);
        lg.Soal3(13);
        //lg.Soal4(48);

    }
    /*public void Soal2(int n1){

        for(int i = 2; i< n1; i++) {
            while(n1%i == 0) {
                System.out.print(i+" ");
                n1 = n1/i;
            }
        }
        if(n1 >2) {
            System.out.println(n1);
        }
    }*/

    public void Soal3(int n2){
        for(int i=2; i< n2; i++) {
            while(n2%i == 0) {
                System.out.print(i+" ");
                n2 = n2/i;
            }
        }
        if(n2>1) {
            System.out.println(n2);
        }
    }
   /* public void Soal4(int n3){
        for(int i=2; i<n3; i++) {
            while(n3%i == 0) {
                System.out.print(i+" ");
                n3 = n3/i;
            }
        }
        if(n3>2) {
            System.out.print(n3);
        }
    }*/

}

