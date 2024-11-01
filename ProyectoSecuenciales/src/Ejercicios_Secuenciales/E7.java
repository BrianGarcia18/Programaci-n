package Ejercicios;

import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {
        int correctas, incorrectas, blanco, notafinal;
        Scanner lectura = new Scanner(System.in);

        System.out.println("¿Cantas respuestas correctas tuvo?");
        correctas = lectura.nextInt();

        System.out.println("¿Cuntas preguntas incorrectas tuvo?");
        incorrectas = lectura.nextInt();

        System.out.println("¿Cuntas preguntas en blando dejó?");
        blanco = lectura.nextInt();

        notafinal = (correctas * 5) + (incorrectas * -1) + (blanco * 0);
        System.out.println("La nota final del estudiante es: " + notafinal);
    }
}
