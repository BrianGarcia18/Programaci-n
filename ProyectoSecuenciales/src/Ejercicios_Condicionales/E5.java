package Ejercicios_Condicionales;

import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        String numero;
        int contador = 0;
        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingrese su numero para determinar cuantos digitos tiene:");
        numero = lectura.nextLine();

        for ( int i = 0; i < numero.length(); i++){
            contador++;
        }
        System.out.println("Su numero contiene " + contador + " digitos.");
    }
}
