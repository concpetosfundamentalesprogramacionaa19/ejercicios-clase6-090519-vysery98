package manejosswitch;

import java.util.Scanner;

/**
 *
 * @author vysery98
 */
public class UsoSwitch4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una cadena que empiece con una vocal");
        String nombre = entrada.nextLine();
        char valor = nombre.charAt(0);

        switch (valor) {
            case 'a':
            case 'e':
            case 'o':
            case 'A':
                System.out.printf("Nombre con inicial (%s) - vocal %s - %s\n",
                        valor, "abierta", nombre.toUpperCase());
                break;

            case 'i':
            case 'u':
                System.out.printf("Nombre con inicial (%s) - vocal %s - %s\n",
                        valor, "cerrada", nombre.toLowerCase());
                break;

            default:
                System.out.println("ninguna de las anteriores");

        }

    }
}
