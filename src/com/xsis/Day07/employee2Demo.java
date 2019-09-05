package com.xsis.Day07;

public class employee2Demo {
    public static void main(String []args){
        employee2 e1 = new employee2("takumi","1234", "budi@gmail.com",  1990, 500.00);
        //System.out.println(e1.toString());
        manager m1 = new manager("tsukasa", "1235","tsukasa@gmail.com",1995,600.00,0.8);
        //System.out.println(m1.toString());
        employee2Interface em1 = new manager("kudo","12345", "agung@gmail.com", 1998, 500.00, 0.5);
        //em1.getInfoEmployee();

       // em1.potongGaji(100.0);
        //em1.getInfoEmployee();

        programmer p1 = new programmer("Heiji" , "1221", "Heiji@shp.com", 1996, 300.00, 9);
        programmer p2 = new programmer("Yusuke", "1222","yusuke@shp.com", 1994, 400   , 15);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println();

        employee2Interface ip1 = new programmer("Heiji ", "1221", "Heiji@shp.com" , 1996, 300.00, 9);
        employee2Interface ip2 = new programmer("Yusuke", "1222"," Yusuke@shp.com", 1994, 400   , 15);
        ip1.potongGaji(100.0);
        ip1.getInfoEmployee();
       /* ip2.potongGaji(50);
        ip2.getInfoEmployee();*/

    }
}
