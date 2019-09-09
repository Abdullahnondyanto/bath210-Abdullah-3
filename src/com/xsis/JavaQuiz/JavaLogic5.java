package com.xsis.JavaQuiz;

public class JavaLogic5 {
    public static void main(String[] args) {
        JavaLogic5 p = new JavaLogic5();
        p.compare("123");
    }

    void compare(String kata) {
        String check = "";
        for (int i = (kata.length() - 1); i >= 0; i--) {
            check = check + kata.charAt(i);
        }
        if (kata.equals(check)) {
            System.out.println(kata + " = " + check + " ini palindrom");
        } else {
            System.out.println(kata + " != " + check + " bukan palindrom");
        }
    }
}

