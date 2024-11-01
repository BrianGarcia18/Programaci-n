package Ejercicios;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        int ventas = 3;
        double sueldo, comision, sueldototal;

        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese el sueldo base");
        sueldo = lectura.nextDouble();
        System.out.println("El sueldo es " + sueldo);

        comision = sueldo * 0.30;
        sueldototal = sueldo + comision;
        System.out.println("La comision por las 3 ventas es " + comision);
        System.out.println("El total a cobrar es " + sueldototal);
    }
}
