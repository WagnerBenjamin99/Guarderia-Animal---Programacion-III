public class Mojarrita extends Animal {

    TipoDeAgua tipoDeAgua;

    public Mojarrita(String nombre, Integer edad, char sexo, Double peso, Especie especie, Persona dueño, TipoDeAgua tipoDeAgua) {
        super(nombre, edad, sexo, peso, dueño);
        setEspecie(Especie.MOJARRITA);
        this.tipoDeAgua = tipoDeAgua;

    }

    public String toString() {
        return super.toString() + ", tipo de agua= " + this.tipoDeAgua + "}";
    }
}
