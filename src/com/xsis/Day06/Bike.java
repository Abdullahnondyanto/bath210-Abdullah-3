package com.xsis.Day06;

public class Bike{

    private String driver;
    private int gear;
    private int cadence;
    private int speed;
    private int id;
    private static int numberOfBikes = 0;

    public Bike(String theDriver, int startGear,int startCadence, int startSpeed){
        driver = theDriver;
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
        numberOfBikes++;
        id = numberOfBikes;
    }

    public String getDriver() {return driver;}
    public void setDriver(String d) {driver = d;}


    public int getGear(){return gear;}
    public void setGear(int g){gear = g;}

    public int getCadence(){return cadence;}
    public void setCadence(int c){cadence = c;}


    public int getSpeed(){return speed;}
    public void setSpeed(int s) {speed = s;}

    public int getID() {return id;}

    public static int getNumberOfBikes() {return numberOfBikes;}
    public String toString ()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("\nDriver: " + driver);
        sb.append("\nGear: " + gear);
        sb.append("\nCadence: " + cadence);
        sb.append("\nSpeed: " + speed);
        sb.append("\nID: " + id + "\n");

        return (new String(sb));
    }

}