package com.xsis.Day04;
    import java.util.Scanner;

    public class logic2no5
    {
        public static void main(String args[]) {
            String str = "Aku sayang kamu";
            //Only Replace first 'Aku sayang kamu' with 'A*u s****g k**u'
            String str1 = str.replaceFirst("Aku sayang kamu", "A*u s****g k**u");
            System.out.println(str1);
        }
    }

