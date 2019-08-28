package com.xsis.day01;

public class Gaya {

    public static void main(String[]args) {
        Gaya gaya = new Gaya();
        int f = gaya.getGaya(8,10);
        System.out.println("f =" +f);

        Gaya Massa = new Gaya();
        int m = Massa.getMassa(80,10);
        System.out.println("m =" +m);

        Gaya Percepatan = new Gaya();
        int a = Percepatan.getPercepatan(8,80);
        System.out.println("a =" +a);

    }
        public int getGaya(int m, int a) {
            return m * a;
    }
        public int getMassa(int f, int a){
            return f/a ;
    }
        public int getPercepatan(int m, int f){
            return f/m ;
    }
}
