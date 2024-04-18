package ejercicio7;

import java.util.Scanner;

public class gradebook3 {
    public static void main(String[] args) {

        int total = 0;
        int gradeCounter = 0;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int fCount = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("ingrese las notas en un rango de 0 a 100");

        while (keyboard.hasNext()) {
            int grade = keyboard.nextInt();
            total += grade;
            ++gradeCounter;

            switch (grade / 10) {
                case 10:
                    ++aCount;
                    break;
                case 9:
                    ++bCount;
                    break;
                case 8:
                    ++cCount;
                    break;
                case 7:
                    ++dCount;
                    break;
                default:
                    ++fCount;
                    break;
            }
        }

        if (gradeCounter != 0) {

            double average = (double) total / gradeCounter;

            System.out.printf("Total of the %d grades entered is " +
                    gradeCounter + total);
            System.out.printf("Class average is " + average);
            System.out.println("número de estudiantes que recibieron cada nota:" +
                    "A: " + aCount +
                    "B: " + bCount +
                    "C: " + cCount +
                    "D: " + dCount +
                    "F: " + fCount);
        } else {
            System.out.println("no ingresaron notas");
        }

    }
}