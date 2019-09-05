package com.xsis.Day07;

public class manager extends employee2 implements employee2Interface {
    private  double comission;

    public manager(String name, String ssn, String emailAddress, int yearOfBirth, Double salary, double comission) {
        super(name, ssn, emailAddress, yearOfBirth, salary);
        this.comission = comission;
    }

    @Override
    public String getInfoEmployee() {
        System.out.println("method call from object manager");
        System.out.println(toString());
        return null;
    }

    @Override
    public void potongGaji(Double potongan){
        super.setSalary(super.getSalary() - potongan);
    }

    public double getComission() {
        return comission;
    }

     public void setComission(double comission) {
        this.comission = comission;
    }

    @Override
    public Double getSalary() {
        double totalComission = this.comission * super.getSalary();
        return super.getSalary() + totalComission;
    }

    @Override
    public String toString() {
        return super.toString() + ", comission = " + this.comission + ", salary+comission = " + getSalary();
    }
}


