package com.xsis.Day06;
import java.util.Scanner;
import javax.swing.JOptionPane;

class TestBike
{
    public static void main(String[] args) {
        String message ="";
        Bike[] bikeRace = new Bike[10];
        bikeRace[0] = new Bike("Cersei Lannister", 0, 0, 0);
        bikeRace[1] = new Bike("Daenerys Targaryen", 10, 60, 22);
        bikeRace[2] = new Bike("Robb Stark", 21, 50, 15);
        bikeRace[0].setGear(3);
        for(int i=0; i < Bike.getNumberOfBikes(); i++)
        {
            System.out.println(bikeRace[i].toString());
        }
        int fastestBikeIndex = findTheFastestDriver(bikeRace);
        System.out.println("\nThe fastest driver is " + bikeRace[fastestBikeIndex].getDriver() + " and the speed of " + bikeRace[fastestBikeIndex].getSpeed() + " mph.");
        System.out.println("\nNumber of Bikes: " + Bike.getNumberOfBikes() + "\n");

    }

    public static int findTheFastestDriver(Bike[] bikeRace)
    {
        int fastestBike = bikeRace[0].getSpeed();
        int fastestBikeIndex = 0;
        for(int i=0; i < Bike.getNumberOfBikes(); i++)
        {
            if (bikeRace[i].getSpeed() >= fastestBike)
            {
                fastestBike = bikeRace[i].getSpeed();
                fastestBikeIndex = i;
            }
        }
        return fastestBikeIndex;
    }

}
