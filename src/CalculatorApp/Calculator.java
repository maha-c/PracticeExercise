package CalculatorApp;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean grading = true;

        while (grading) {
            System.out.print(" Enter a grade (0-100): ");
            int grade = scanner.nextInt();
            char letterGrade = calculateLetterGrade(grade);
            System.out.println("Letter grade: " + letterGrade);

            System.out.print("Do you want to grade another assignment? (y/n): ");
            char response = scanner.next().charAt(0);
            grading = (response == 'y' || response == 'Y');
        }

        System.out.println("Thanks for using the Grading Calculator");

    }

    private static char calculateLetterGrade(int grade) {
        if(grade >= 91 && grade <=100) {
            return  'A';
        }
        else if(grade >= 81 && grade <=90) {
            return  'B';
        }
        else if(grade >= 71 && grade <=80) {
            return  'C';
        }
        else if(grade >= 61 && grade <=70) {
            return  'D';
        }
        else if(grade >= 51 && grade <=60) {
            return  'E';
        }
        else {
            return  'F';
        }
    }
}
