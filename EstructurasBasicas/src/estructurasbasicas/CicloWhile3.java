package estructurasbasicas;

import java.util.Scanner;

/**
 *
 * @author vysery98
 */
public class CicloWhile3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // lectura de datos

        String mensajeFinal = "";
        String nombre = "";
        String apellido = "";
        String profesion = "";
        String opcion = "";
        int contador = 1;
        boolean bandera = true;

        mensajeFinal = String.format("%s%s\n\n", mensajeFinal, "Informe de la "
                + "ciudad de Loja");
        mensajeFinal = String.format("%s%s\n\n", mensajeFinal, "Listado de "
                + "Personas");

        while (bandera == true) {

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

            System.out.println("Digite \"n\" para salir");
            opcion = scan.nextLine();
            if (opcion.equals("n")) {
                bandera = false;
            }

        }

        System.out.printf("%s", mensajeFinal);

    }

}
