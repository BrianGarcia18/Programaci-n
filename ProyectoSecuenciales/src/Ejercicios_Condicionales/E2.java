package Ejercicios_Condicionales;

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        String palabra;
        int contador = 0;
        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingrese su palabra para determinar cuantas vocales tiene.");
        palabra = lectura.nextLine();
        for (int i = 0; i < palabra.length(); i++){
            char c = palabra.charAt(i);

            if ( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                contador++;
            }
        }
        System.out.println("Contador de Vocales: " + contador);
    }
}