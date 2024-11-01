package Ejercicios_Condicionales;

import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        String palabra;
        boolean esPalindromo = true;
        Scanner lectura = new Scanner(System.in);

        System.out.println("Escriba su palabra para ver si es un Palindromo:");
        palabra = lectura.nextLine();
        int longitud = palabra.length();

        for (int i =0; i < longitud / 2; i++){
            if (palabra.charAt(i) != palabra.charAt(longitud -1 -i)){
                esPalindromo = false;
                break;
            }
        }
        if (esPalindromo){
            System.out.println("Su palabra es palindroma");
        }else{
            System.out.println("Su palabra no es palindroma");
        }
    }
}
