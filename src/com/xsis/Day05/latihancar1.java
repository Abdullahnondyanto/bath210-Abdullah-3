package com.xsis.Day05;

public class latihancar1 {
    String car;
    String licensePlate;
    int speed;
    int rpm;
    int gear;
    String fuelLevel;
    String direction;
    int engineTemperature;

    void Start(){
        System.out.println("   Engine start   ");
        car = "Mazda";
        licensePlate ="B4231Hi";
        speed = 0;
        rpm = 0;
        gear = 0;
        fuelLevel= "full";
        direction="test";
        engineTemperature= 80;
    }

    void goChangegear (int gear) {
        System.out.println("... Change gear ...");
        this.speed = speed;
    }

        void goFaster (int speed, int rpm, int gear, int engineTemperature){
        System.out.println(".... Go faster ...");
        this.speed = speed;
        this.rpm = rpm;
        this.gear = gear;
        this.engineTemperature = engineTemperature;
    }

    void goSlower (int speed, int rpm, int gear, int engineTemperature){
        System.out.println("... Go faster ...");
        this.speed = speed;
        this.rpm = rpm;
        this.gear = gear;
        this.engineTemperature = engineTemperature;
    }


    void print(){
        System.out.println("Brand : " + car);
        System.out.println("License Plate : " + licensePlate);
        System.out.println("Faster : " + speed +" km/jam");
        System.out.println("RPM : " + rpm);
        System.out.println("Gear : " + gear);
        System.out.println("Fuel Level : " + fuelLevel);
        System.out.println("Engine Temperatur : " + engineTemperature+" celcius");

    }



}
