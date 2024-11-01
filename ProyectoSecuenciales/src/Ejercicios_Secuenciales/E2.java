package Ejercicios;

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la calificación del primer parcial:");
        double parcial1 = scanner.nextDouble();

        System.out.println("Ingresa la calificación del segundo parcial:");
        double parcial2 = scanner.nextDouble();

        System.out.println("Ingresa la calificación del tercer parcial:");
        double parcial3 = scanner.nextDouble();

        System.out.println("Ingresa la calificación del examen final:");
        double examenFinal = scanner.nextDouble();

        System.out.println("Ingresa la calificación del trabajo final:");
        double trabajoFinal = scanner.nextDouble();

        double promedioParciales = (parcial1 + parcial2 + parcial3) / 3;

        double calificacionFinal = (promedioParciales * 0.55) + (examenFinal * 0.30) + (trabajoFinal * 0.15);

        System.out.println("La calificación final es: " + calificacionFinal);

    }
}

