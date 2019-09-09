package com.xsis.JavaQuiz;

public class JavaLogic3 {
        public static void main(String[] args) {
            JavaLogic3 score= new JavaLogic3();
            score.getgrade(65);

        }
        void getgrade(int grade){
            if (grade>=90 && grade<=100){
                System.out.print("A");
            }
            else if (grade>=80 && grade<=89){
                System.out.print("B");
            }
            else if (grade>=70 && grade<=79){
                System.out.print("C");
            }
            else if (grade>=60 && grade<=69){
                System.out.print("D");
            }
            else if(grade<60){
                System.out.print("F");
            }
        }
}
