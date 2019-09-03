package com.xsis.Day02;

public class logic1no10 {
    public static void main(String[] args) {
        int min =3;
        int max =3;
        int interval=4;
        int deret = 3;
        for (int i = 0; i <= 6 ; i++) {
            System.out.print(deret+" ");
            interval +=3;
            if (interval % 4==0){
                System.out.print("* ");
                deret = deret* max;
            }else{
                deret = deret* min;
            }
        }
    }

}
