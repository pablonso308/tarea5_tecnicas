package ejercicio1;

public class ejercicio1 {

    public static void main(String[] args) {
        cuentaAtrasLanzamiento();
    }

    public static void cuentaAtrasLanzamiento() {
        for (int i = 10; i >= 0; i--) {
            System.out.println("Cuenta atrás: " + i);
            esperarUnSegundo(); // Agrega una pausa de 1 segundo entre cada cuenta atrás
        }
        System.out.println("¡Despegue!");
    }

    public static void esperarUnSegundo() {
        try {
            Thread.sleep(1000); // Pausa el hilo durante 1000 milisegundos (1 segundo)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
