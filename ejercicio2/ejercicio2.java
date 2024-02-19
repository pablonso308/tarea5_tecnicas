package ejercicio2;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        analizarFrecuenciaCaracteres();
    }

    public static void analizarFrecuenciaCaracteres() {
        Map<Character, Integer> frecuencias = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        char caracter = obtenerCaracter(scanner);

        while (caracter != '\n') {
            if (frecuencias.containsKey(caracter)) {
                frecuencias.put(caracter, frecuencias.get(caracter) + 1);
            } else {
                frecuencias.put(caracter, 1);
            }
            caracter = obtenerCaracter(scanner);
        }

        System.out.println("Frecuencia de caracteres:");
        for (Map.Entry<Character, Integer> entry : frecuencias.entrySet()) {
            System.out.println("'" + entry.getKey() + "': " + entry.getValue() + " veces");
        }
    }

    public static char obtenerCaracter(Scanner scanner) {
        System.out.println("Ingrese un carácter (presione Enter para finalizar): ");
        String input = scanner.nextLine();
        return (input.length() > 0) ? input.charAt(0) : '\n';
    }
}
