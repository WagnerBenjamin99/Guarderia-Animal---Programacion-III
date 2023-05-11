import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Object> listaAnimales = new ArrayList<>();

        Persona duenio1 = new Persona("Benjamin", 22657657, "aguado");
        Perro perro1 = new Perro("HARRY", 2, 'M', 6.5, duenio1, "Pitbull");


        perro1.setInidiceLista(listaAnimales.size());
        listaAnimales.add(perro1);
        System.out.println(perro1.getInidiceLista());
        System.out.println(perro1.toString());

    }
    
}