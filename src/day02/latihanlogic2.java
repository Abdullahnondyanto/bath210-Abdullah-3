package day02;

public class latihanlogic2 {

    public static void main (String[]args){
        int min =4;
        int max =8;
        int interval=2;
        int deret = 1;
        for (int i = 0; i <= 4 ; i++) {
            System.out.print(deret+" ");
            interval +=1;
            if (interval % 2==0){
                System.out.print("*");
                deret = deret+ max;
            }else{
                deret = deret+ min;
            }
        }
    }
}

