package day02;

public class latihanlogic3 {

    public static void main(String[]args){
        int deret = 1;
        int interval = 2;
        for (int i = 0; i <= 4 ; i++) {
            System.out.print(deret+" ");
            deret = deret +4;
            interval +=1;
            if (interval % 2==0){
                System.out.print("*");
            }
        }
    }
}
