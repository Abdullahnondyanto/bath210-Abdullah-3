package com.xsis.Day07;

public class programmer extends employee2 implements employee2Interface {
    //hitung bonus : jika masa kerja > 10 tahun, bonus = 5*salary. jika masa kerja < 10 tahun, bonus = 2*salary
    private int masakerja;

    public programmer(String name, String ssn, String emailAddress, int yearOfbirth, double salary, int masakerja) {
        super(name, ssn, emailAddress, yearOfbirth, salary);
        this.masakerja = masakerja;
    }

    @Override
    public String getInfoEmployee() {
        System.out.println("Method call from object programmer");
        System.out.println(toString());
        return null;
    }

    @Override
    public void potongGaji(Double potongan) {
        super.setSalary(super.getSalary() - potongan);
    }

    public int getMasakerja() {
        return masakerja;
    }

    public void setMasakerja(int masakerja) {
        this.masakerja = masakerja;
    }

    @Override
    public Double getSalary() {       double bonus = super.getSalary();
        if (this.masakerja > 10){
            bonus = 5 * super.getSalary();
        }
        else if (this.masakerja < 10) {
            bonus = 2* super.getSalary();
        }
        return bonus;

    }

    @Override
    public String toString() {
        return super.toString() +
                ", bonus=" + getSalary() +
                ", masakerja=" + masakerja +
                '}';
    }
}