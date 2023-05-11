public class Persona {
    String nombre;
    Integer dni;
    String direccion;

    public Persona(String nombre, Integer dni, String direccion) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "{ nombre='" + nombre + '\'' +
                ", dni=" + dni +
                ", direccion='" + direccion + '}';
    }
}
