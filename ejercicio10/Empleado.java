package ejercicio10;

 public class Empleado {
    private String nombre;
    private String numeroEmpleado;
    private String numeroSeguridadSocial;

    public Empleado(String nombre, String numeroEmpleado, String numeroSeguridadSocial) {
        this.nombre = nombre;
        this.numeroEmpleado = numeroEmpleado;
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", numeroEmpleado='" + numeroEmpleado + '\'' +
                ", numeroSeguridadSocial='" + numeroSeguridadSocial + '\'' +
                '}';
    }
}
