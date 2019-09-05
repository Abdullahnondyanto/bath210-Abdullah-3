package com.xsis.Day07;

public class EmployeeDemo {
        public static void main(String[] args) {
                Employee e1 = new Employee("nondy","1234","nondy@gmail.com",1980,90000);
                Employee e2 = new Employee(" tia ","1235"," tia@gmail.com ",1981,30000);
                Employee e3 = new Employee("astri","1236","astri@gmail.com",1982,40000);
                Employee e4 = new Employee("riyan","1237","riyan@gmail.com",1983,70000);
                Employee e5 = new Employee("ikbal","1267","ikbal@gmail.com",1983,60000);

                Employee[] listemployee={e1,e2,e3,e4,e5};
                EmployeeDemo ed = new EmployeeDemo();
                ed.findAll(listemployee);
                ed.findbyssn(listemployee,"12678");
                ed.maxsalary(listemployee);
        }

        void findAll(Employee[] le){
                System.out.println("Find ALL Employee ");
                System.out.println("Nama    SSN     Email   YOB     Salary");
                for(int i=0;i<le.length;i++){
                        System.out.println(le[i].getName()+" "+le[i].getSsn()+"  "
                                +le[i].getEmailAddress()+"   "+le[i].getYearOfbirth()+"  "+le[i].getSalary());
                }
        }

        void findbyssn(Employee[] le,String SSN){
                int found=0;
                System.out.println("Employee with SSN = "+SSN);
                for (int i = 0; i < le.length; i++) {
                        if (le[i].getSsn() == SSN) {
                                System.out.println(le[i].getName() + " " + le[i].getSsn() + "  "
                                        + le[i].getEmailAddress() + "   " + le[i].getYearOfbirth() + "  " + le[i].getSalary());
                                found=1;
                                break;
                        }
                }
                if(found==0){
                        System.out.println("Employee with SSN "+SSN+" not found");
                }
        }


        void maxsalary(Employee[] le){
                double max=0;
                for(int i=0;i<le.length;i++){
                        if (le[i].getSalary() > max){
                                max=le[i].getSalary();
                        }
                        else{
                                max=max;
                        }
                }
                System.out.println("Employee with salary "+max+" is the highest salary");
                for(int i=0;i<le.length;i++){
                        if (le[i].getSalary() == max){
                                System.out.println(le[i].getName()+" "+le[i].getSsn()+"  "
                                        +le[i].getEmailAddress()+"   "+le[i].getYearOfbirth()+"  "+le[i].getSalary());
                        }
                }
        }


}