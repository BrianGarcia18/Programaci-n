package Ejercicios;

import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        int A,B,NumAux;
        Scanner numeros = new Scanner(System.in);

        System.out.println("Ingrese A: ");
        A = numeros.nextInt();
        System.out.println("Ingrese B: ");
        B = numeros.nextInt();

        NumAux = A;
        A = B;
        B = NumAux;

        System.out.println("A ahora es " + A);
        System.out.println("B ahora es " + B);

    }
}
