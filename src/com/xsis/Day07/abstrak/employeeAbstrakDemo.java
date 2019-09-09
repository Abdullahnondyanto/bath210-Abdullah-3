package com.xsis.Day07.abstrak;


public class employeeAbstrakDemo {
    public static void main(String[] args) {
        staff st = new staff("Sabo", "1334", "sabo@revarmy.com",1995,700.00);
        System.out.println(st.toString());
        System.out.println(st.getTotalGaji());
    }
}