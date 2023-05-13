public class Gato extends Animal{

    public Gato(String nombre, Integer edad, char sexo, Double peso, Persona duenio) {
        super(nombre, edad, sexo, peso, duenio);
        setEspecie(Especie.GATO);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
