public class Perro extends Animal{


    String raza;

    public Perro(String nombre, Integer edad, char sexo, Double peso, Persona dueño, String raza) {
        super(nombre, edad, sexo, peso, dueño);
        this.raza = raza;
        setEspecie(Especie.PERRO);
    }

    @Override
    public String toString() {
        return "Raza: " + this.raza +  super.toString();
    }

}
