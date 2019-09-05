package com.xsis.Day07.abstrak;

public abstract class employee {
    private String name;
    private String ssn;
    private String emailAddress;
    private int yearOfbirth;
    private double salary;


    public employee(String name, String ssn, String emailAddress, int yearOfbirth, double salary) {
        this.name = name;
        this.ssn = ssn;
        this.emailAddress = emailAddress;
        this.yearOfbirth = yearOfbirth;
        this.salary = salary;
    }

    public abstract double getTotalGaji();

    @Override
    public String toString() {
        return "employee{" +
                "name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", yearOfbirth=" + yearOfbirth +
                ", salary=" + salary +
                '}';
    }
}
