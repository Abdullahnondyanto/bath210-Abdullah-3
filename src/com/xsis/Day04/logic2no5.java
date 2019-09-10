/*package com.xsis.Day04;
import java.util.Scanner;

public class logic2no5 {
    public static void main(String []args){
        int start=0;
        int end =0;
        String finalWord="";
        // loop sepanjang kalimat Aku Sayang Kamu
        for (int i = 0; i < s.length() ; i++) {
                // ubah tiap kalimat menjadi karater, dimulai dari index ke-0
                char ch = s.charAt(i);
                // variable end akan menyimpan index i, kita gunakan untuk detek akhir kata
                end = i;
                // check apakah ketemu karakter space, jika true maka process
                if (ch == ' '){v-
                    // cut kalimat menjadi per kata, dengan memotong kata dari index start to end
                    String cutWord = s.substring(start,end);
                    // simpang panjang kata yang sudah di cut, untuk kita proses nilai tengah jadi *
                    int lengthWord = s.substring(start,end).length();
                    // create variable tuk simpan per karater, misal Aku menjadi A,k, u
                    String kata="";
                    for (int j = 0; j < lengthWord ; j++) {
                        char chin= cutWord.charAt(j);
                        if ((j ==0 )|| (j==lengthWord-1)){
                            kata=kata +chin;
                        }
                        if (j> 0 && j < lengthWord-1){
                            kata=kata +"*";
                        }

                    }
                    start = end+1;
                    finalWord = finalWord+" "+kata;

                }
            }
            System.out.println("finalword : "+finalWord);
        }
    }*/