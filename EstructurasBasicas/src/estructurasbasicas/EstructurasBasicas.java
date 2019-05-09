package estructurasbasicas;

import java.util.Scanner;

/**
 *
 * @author vysery98
 */
public class EstructurasBasicas {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // lectura de datos

        String mensajeFinal = "";
        String nombre = "";
        String apellido = "";
        String profesion = "";
        int contador = 1;
        mensajeFinal = String.format("%s%s\n\n", mensajeFinal, "Informe de la "
                + "ciudad de Loja");
        mensajeFinal = String.format("%s%s\n\n", mensajeFinal, "Listado de "
                + "Personas");

        while (contador < 5) {

            System.out.println("Persona" + contador + ":");
            System.out.print("Ingrese sus nombres: ");
            nombre = scan.nextLine();
            System.out.print("Ingrese sus apellidos: ");
            apellido = scan.nextLine();
            System.out.print("Ingrese su profesión: ");
            profesion = scan.nextLine();

            mensajeFinal = String.format("%sPersona %d: %s %s - %s\n",
                    mensajeFinal, contador, nombre, apellido, profesion);
            contador = contador + 1; // que contador se incremente

        }

        System.out.printf("%s", mensajeFinal);

    }

}
