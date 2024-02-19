package ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        calcularMediaCalificaciones();
    }

    public static void calcularMediaCalificaciones() {
        ArrayList<Double> calificaciones = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        double nota = obtenerNota(scanner);

        while (nota != -1) {
            calificaciones.add(nota);
            nota = obtenerNota(scanner);
        }

        double media = calcularMedia(calificaciones);

        System.out.print("Calificaciones: ");
        for (double calificacion : calificaciones) {
            System.out.print(calificacion + " ");
        }
        System.out.println("- Media: " + media);
    }

    public static double obtenerNota(Scanner scanner) {
        System.out.println("Ingrese una calificación (o -1 para finalizar): ");
        return scanner.nextDouble();
    }

    public static double calcularMedia(ArrayList<Double> calificaciones) {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return (calificaciones.size() > 0) ? suma / calificaciones.size() : 0;
    }
}
