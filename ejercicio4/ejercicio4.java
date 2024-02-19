package ejercicio4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        simularElecciones();
    }

    public static void simularElecciones() {
        Map<Integer, Integer> votos = new HashMap<>();
        int codigoEspecial = 68753421;

        int voto = obtenerVoto();

        while (voto != codigoEspecial) {
            if (votos.containsKey(voto)) {
                votos.put(voto, votos.get(voto) + 1);
            } else {
                votos.put(voto, 1);
            }
            voto = obtenerVoto();
        }

        mostrarResultados(votos);
    }

    public static int obtenerVoto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número de candidato al que desea votar (o ingrese el código especial para finalizar(68753421): ");
        return scanner.nextInt();
    }

    public static void mostrarResultados(Map<Integer, Integer> votos) {
        System.out.println("Resultados de las elecciones:");
        for (Map.Entry<Integer, Integer> entry : votos.entrySet()) {
            System.out.println("Candidato " + entry.getKey() + ": " + entry.getValue() + " votos");
        }
    }
}

