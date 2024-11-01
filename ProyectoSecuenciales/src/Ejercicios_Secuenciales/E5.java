package Ejercicios;

import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        int horas, minutos, segundos, tiempoViaje, tiempoTotalSegundos, horasLlegada, minutosLlegada, segundosLlegada;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la hora de partida (HH):");
        horas = scanner.nextInt();

        System.out.println("Ingresa los minutos de partida (MM):");
        minutos = scanner.nextInt();

        System.out.println("Ingresa los segundos de partida (SS):");
        segundos = scanner.nextInt();

        System.out.println("Ingresa el tiempo de viaje en segundos:");
        tiempoViaje = scanner.nextInt();

        tiempoTotalSegundos = horas * 3600 + minutos * 60 + segundos + tiempoViaje;

        horasLlegada = (tiempoTotalSegundos / 3600) % 24;
        minutosLlegada = (tiempoTotalSegundos / 60) % 60;
        segundosLlegada = tiempoTotalSegundos % 60;

        System.out.printf("La hora de llegada a la ciudad B es: %02d:%02d:%02d\n", horasLlegada, minutosLlegada, segundosLlegada);

    }
}

