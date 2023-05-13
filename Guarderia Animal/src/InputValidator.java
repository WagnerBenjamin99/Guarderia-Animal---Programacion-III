import java.io.Reader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputValidator {


    public static int ingresarEntero(){

        boolean flag = true;
        int opcion = 0;

        do {
            try {
                Scanner sc = new Scanner(System.in);
                opcion = sc.nextInt();
                flag = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada incorrecta, vuelva a ingresar..");
                flag = false;
            }
        }while (!flag);
        return opcion;
    }


    public static String ingresarString(){

        boolean flag = true;
        String cadena = null;

        do {
            try {
                Scanner sc = new Scanner(System.in);
                cadena = sc.next();
                flag = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada incorrecta, vuelva a ingresar..");
                flag = false;
            }
        }while (!flag);
        return cadena;
    }

    public static Double ingresarDouble(){

        boolean flag = true;
        Double decimal = null;

        do {
            try {
                Scanner sc = new Scanner(System.in);
                decimal = sc.nextDouble();
                flag = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada incorrecta, vuelva a ingresar..");
                flag = false;
            }
        }while (!flag);
        return decimal;
    }

    public static char ingresarChar() {

        boolean flag = true;
        char caracter = ' ';
        String caracterString = null;

        do {
            try {
                Scanner sc = new Scanner(System.in);
                caracterString=sc.next();

                if(caracterString.length() == 1){
                    caracter = caracterString.charAt(0);
                    flag = true;
                }
                else new InputMismatchException();
            } catch (InputMismatchException e) {
                System.out.println("Entrada incorrecta, vuelva a ingresar..");
                flag = false;
            }
        }while(!flag);

        return caracter;
    }
}
