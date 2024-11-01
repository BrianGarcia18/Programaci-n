package Ejercicios;

import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        double v1, v2, d,totalHoras, totalMinutos;
        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingrese la distancia entre los 2 vehiculos (KM)");
        d = lectura.nextDouble();
        System.out.println("Inmgrese la velocidad del vehiculo 1 (KM/H)");
        v1 = lectura.nextDouble();
        System.out.println("Inmgrese la velocidad del vehiculo 2 (KM/H)");
        v2 = lectura.nextDouble();

        if (v2 <= v1) {
            System.out.println("El vehículo que está detrás no es más rápido, nunca alcanzará al otro.");
        }else {
            totalHoras = d / (v2 - v1);
            totalMinutos = totalHoras * 60;
            System.out.println("El vehículo más rápido alcanzará al más lento en: " + totalMinutos + " minutos.");
        }
    }
}
