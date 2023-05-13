public abstract class Animal {

    private String nombre;
    private Integer edad;
    private char sexo;
    private Double peso;
    private Especie especie;
    private Persona duenio;



    public Animal(String nombre, Integer edad, char sexo, Double peso, Persona duenio) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.duenio = duenio;

    }



    public String getNombre() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public Double getPeso() {
        return peso;
    }

    public Especie getEspecie() {
        return especie;
    }

    public Persona getDuenio() {
        return duenio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public void setDuenio(Persona duenio) {
        this.duenio = duenio;
    }



    @Override
    public String toString() {
        return
                "\nNombre: " + nombre +
                "\nEdad: " + edad +
                "\nSexo: " + sexo +
                "\nPeso: " + peso +
                "\nEspecie: " + especie +
                "\nDatos del dueño: " + duenio.toString();
    }

    public void saludar(){
        System.out.println("Hola me llamo " + this.nombre + " y soy un " + this.especie);
    }

}

