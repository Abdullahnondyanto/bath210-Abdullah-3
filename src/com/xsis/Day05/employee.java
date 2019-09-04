package com.xsis.Day05;

public class employee {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.length()>0) {
            this.name = name;
        }
    }

    public String getSsn() {
        return ssn;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getYearofBirth() {
        return yearofBirth;
    }

    public void setYearofBirth(int yearofBirth) {
        this.yearofBirth = yearofBirth;
    }

    private final String ssn;
    private String emailAddress;
    private int  yearofBirth;
    private static int vocationDays=10;



    public employee(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }


    public employee(String name, String ssn,String emailAddress){
        this.name=name;
        this.ssn=ssn;
        this.emailAddress=emailAddress;
    }

    void print() {
    System.out.println("Name: " + name);
    System.out.println("SSN: " + ssn);
    System.out.println("Email Address: " + emailAddress);
    System.out.println("Year Of Birth: " + yearofBirth); }
}
