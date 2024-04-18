package ejercicio6;

import java.util.Scanner;
public class interescompuesto {
        public static void main(String[] args) {
            double operacion;
            double principal = 1000;
            double interes = 0.05;
            System.out.println("year          Amountondeposit");
            for (int year  = 1; year<=10; year++) {
                operacion = principal * Math.pow(1 + interes, year);
                System.out.println(year + "           " + operacion);
            }


        }
    }
