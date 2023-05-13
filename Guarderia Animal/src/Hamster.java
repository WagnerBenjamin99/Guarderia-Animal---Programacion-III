public class Hamster extends Animal{
    public Hamster(String nombre, Integer edad, char sexo, Double peso, Persona duenio) {
        super(nombre, edad, sexo, peso, duenio);
        setEspecie(Especie.HAMSTER);
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
