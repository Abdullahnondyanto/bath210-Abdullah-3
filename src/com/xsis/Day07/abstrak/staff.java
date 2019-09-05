package com.xsis.Day07.abstrak;

public class staff extends employee {
    public staff(String name, String ssn, String emailAddress, int yearOfbirth, double salary) {
        super(name, ssn, emailAddress, yearOfbirth, salary);
    }

    @Override
    public double getTotalGaji() {
        return super.getSalary();
    }
}
