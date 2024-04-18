package Ejercicio2;

import java.util.Scanner;

public class autotest {
    public static void main(String[] args) {
        auto vehiculo=new auto();
        vehiculo.automovil("hylux","toyota",2012,38000000);
        System.out.println("su coche");
        Scanner scanner = new Scanner(System.in);
        int valorinicial=vehiculo.getPrecio();
        int valordepreciacion=10/100;

        System.out.println("Ingrese el año actual");
        int año_actual= scanner.nextInt();
        int añospasados=año_actual- vehiculo.getAño();
        double valor_actual=valorinicial*(10/100*añospasados);

        System.out.println("marca de su vehiculo es " + vehiculo.getMarca());
        System.out.println("marca de su vehiculo es " + vehiculo.getModelo());
        System.out.println("marca de su vehiculo es" + vehiculo.getAño());
        System.out.println("marca de su vehiculo es " + vehiculo.getPrecio());



        }

    }
