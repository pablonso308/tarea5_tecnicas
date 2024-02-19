package ejercicio10;


import java.util.HashMap;

public class ejercicio10 {
    private HashMap<String, Empleado> tablaHash;

    public ejercicio10() {
        this.tablaHash = new HashMap<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        tablaHash.put(empleado.getNombre(), empleado);
        tablaHash.put(empleado.getNumeroEmpleado(), empleado);
        tablaHash.put(empleado.getNumeroSeguridadSocial(), empleado);
    }

    public Empleado buscarEmpleado(String claveBusqueda) {
        return tablaHash.get(claveBusqueda);
    }

    public static void main(String[] args) {
        ejercicio10 sistema = new ejercicio10();
        Empleado empleado = new Empleado("Juan", "123", "456");
        sistema.agregarEmpleado(empleado);
        Empleado empleadoBuscado = sistema.buscarEmpleado("123");
        System.out.println(empleadoBuscado);
    }
}