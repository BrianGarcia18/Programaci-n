package Ejercicios;

import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        String Nombre, Apellido;
        char inicialNombre, inicialApellido;
        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        Nombre = lectura.nextLine();

        System.out.println("Ingrese su apellido");
        Apellido = lectura.nextLine();

        inicialNombre = Nombre.charAt(0);
        inicialApellido = Apellido.charAt(0);

        System.out.println("Las iniciales son: " + inicialNombre + inicialApellido);
    }
}
