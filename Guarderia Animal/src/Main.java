import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Animal> listaAnimales = new ArrayList<>();
        String menu = """
                [1] Ingresar animal
                [2] Retirar animal
                [3] Cantidad de animales
                [4] Listar animales
                [5] Hacer saludar a todos
                [0] SALIR
                """;
        String menuEspecies = """
                [1] Perro
                [2] Gato
                [3] Hamster
                [4] Mojarrita
                """;


        int opcionMenu = 0;
        boolean flag = false;
        boolean flagSalir = false;
        Scanner sc = new Scanner(System.in);

        do {

            System.out.println(menu);
            System.out.print("Ingrese opcion: ");
            opcionMenu = InputValidator.ingresarEntero();


            switch (opcionMenu) {
                case 0:
                    flagSalir = true;
                    break;
                case 1:
                    boolean flagEspecie = true;

                    do {
                        int opcionEspecie = 0;
                        Especie especieMascota = null;

                        System.out.println(menuEspecies);
                        System.out.println("Seleccione la especie: ");
                        opcionEspecie = InputValidator.ingresarEntero();

                        if (opcionEspecie == 1) especieMascota = Especie.PERRO;
                        else if (opcionEspecie == 2) especieMascota = Especie.GATO;
                        else if (opcionEspecie == 3) especieMascota = Especie.HAMSTER;
                        else if (opcionEspecie == 4) especieMascota = Especie.MOJARRITA;
                        else {
                            System.out.println("Especie incorrecta, vuelva a ingresar");
                            flagEspecie = false;
                        }
                        ingresarMascota(listaAnimales, especieMascota);
                    } while (!flagEspecie);
                    break;
                case 2:
                    retirarAnimal(listaAnimales);
                    break;
                case 3:
                    cantidadAnimales(listaAnimales);
                    break;
                case 4:
                    verMascotas(listaAnimales);
                    break;
                case 5:
                    saludo(listaAnimales);
                    break;
                default:
                    flagSalir = false;
                    System.out.println("No ingreso una opcion valida");
            }
        } while ((opcionMenu !=0 ) && !flagSalir);
    }

    public static void ingresarMascota(Collection<Animal> listaMascotas, Especie especie) {

        String nombre = null, nombreDuenio = null, direccionDuenio = null, raza = null;
        int edad = 0, dniDuenio = 0;
        char sexo = ' ';
        double peso = 0;


        System.out.println("Datos personales del dueño: ");
        System.out.print("Nombre: ");
        nombreDuenio = InputValidator.ingresarString();
        System.out.print("DNI: ");
        dniDuenio = InputValidator.ingresarEntero();
        System.out.print("Direccion: ");
        direccionDuenio = InputValidator.ingresarString();

        Persona duenio = new Persona(nombreDuenio, dniDuenio, direccionDuenio);

        System.out.println("Datos de la mascota: ");
        System.out.print("Nombre: ");
        nombre = InputValidator.ingresarString();
        System.out.print("Edad: ");
        edad = InputValidator.ingresarEntero();
        System.out.print("Peso: ");
        peso = InputValidator.ingresarDouble();

        boolean flagSexo = false;
        do {
            System.out.println("[M] MACHO");
            System.out.println("[H] HEMBRA");
            System.out.print("Sexo: ");
            sexo = InputValidator.ingresarChar();
            if(!"M".equalsIgnoreCase(String.valueOf(sexo)) && !"H".equalsIgnoreCase(String.valueOf(sexo))){
                System.out.println("Sexo incorrecto, vuelva a ingresar");
            }else{
                flagSexo=true;
            }
        }while(!flagSexo);



        if (especie.equals(Especie.MOJARRITA)){

            int opcion;
            TipoDeAgua tipoDeAgua = null;

            do {

                System.out.println("[1] Agua salada");
                System.out.println("[2] Agua dulce");
                opcion = InputValidator.ingresarEntero();
                if (opcion == 1)tipoDeAgua=TipoDeAgua.SALADA;
                else if (opcion == 2)tipoDeAgua=TipoDeAgua.DULCE;
                else System.out.println("Opcion incorrecta, vuelva a ingresar ");

            }while (opcion<1 || opcion>2);

            Mojarrita mascota = new Mojarrita(nombre,edad, sexo,peso,duenio,tipoDeAgua);
            listaMascotas.add(mascota);

        } else if (especie.equals(Especie.PERRO)) {

            System.out.print("Raza: ");
            raza = InputValidator.ingresarString();
            Perro mascota = new Perro(nombre, edad, sexo, peso, duenio, raza);
            listaMascotas.add(mascota);

        } else if (especie.equals(Especie.GATO)) {

            Gato mascota = new Gato(nombre, edad, sexo, peso, duenio);
            listaMascotas.add(mascota);
        }
        else {
            Hamster mascota = new Hamster(nombre, edad, sexo, peso, duenio);
            listaMascotas.add(mascota);
        }

    }
    public static void verMascotas(Collection<Animal> listaMascotas){

        if (listaMascotas.size() == 0) System.out.println("No hay animales en la guarderia");
        else {
            for (Animal mascota : (List<Animal>) listaMascotas) {
                System.out.println(mascota.toString());
                System.out.println("Posicion en la lista: " + ((List<Animal>) listaMascotas).indexOf(mascota));
            }
        }
    }

    public static void cantidadAnimales(Collection<Animal> listaAnimales){
        System.out.println("Actualmente hay " + listaAnimales.size() + " mascotas en la guarderia. ");
    }

    public static void saludo(Collection<Animal> listaAnimales){

        if(listaAnimales.size() > 0) {
            for (Animal animal : listaAnimales) animal.saludar();
        }
        else System.out.println("No hay animales en la guarderia");
    }

    public static void retirarAnimal(Collection<Animal> listaAnimales){
        Integer posicion = null;
        boolean flag = false;


        do {
            System.out.println("Ingrese la posicion en la lista: ");
            posicion = InputValidator.ingresarEntero();

            if(listaAnimales.size() == 0){
                System.out.println("No hay mascotas para retirar");
                break;
            }
            else if (posicion >= 0 && posicion < listaAnimales.size()) {
                flag = true;
                ((ArrayList<Animal>) listaAnimales).remove((int)posicion);

            }
            else System.out.println("Posicion incorrecta, vuelva a ingresar");
        }while(!flag);


    }
}









