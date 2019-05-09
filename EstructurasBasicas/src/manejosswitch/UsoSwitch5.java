package manejosswitch;

import java.util.Scanner;

/**
 *
 * @author vysery98
 */
public class UsoSwitch5 {

    /**
     * Desarrollar una aplicación que me permita ingresar placas de carros se
     * asume que las placas ingresadas pertenecen a la región Costa del Ecuador,
     * en base a la placa nuestro programa determinará y presentará la placa con
     * la provincia a la que pertenece. E: Esmeraldas. G: Guayas. J: Santo
     * Domingo M: Manabí. O: El Oro. R: Los Ríos Y: Santa Elena
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la placa: ");
        String placa;
        placa = scan.nextLine();
        char valor = placa.charAt(0);

        switch (valor) {

            case 'e':
            case 'E':
                System.out.printf("Placa: %s\nProvincia: %s",
                        placa.toUpperCase(), "Esmeraldas");
                break;

            case 'g':
            case 'G':
                System.out.printf("Placa: %s\nProvincia: %s",
                        placa.toUpperCase(), "Guayas");
                break;

            case 'j':
            case 'J':
                System.out.printf("Placa: %s\nProvincia: %s",
                        placa.toUpperCase(), "Santo Domingo");
                break;

            case 'm':
            case 'M':
                System.out.printf("Placa: %s\nProvincia: %s",
                        placa.toUpperCase(), "Manabí");
                break;

            case 'o':
            case 'O':
                System.out.printf("Placa: %s\nProvincia: %s",
                        placa.toUpperCase(), "El Oro");
                break;

            case 'r':
            case 'R':
                System.out.printf("Placa: %s\nProvincia: %s",
                        placa.toUpperCase(), "Los Ríos");
                break;

            case 'y':
            case 'Y':
                System.out.printf("Placa: %s\nProvincia: %s",
                        placa.toUpperCase(), "Santa Elena");
                break;

            default:
                System.out.println("La placa no pertenece a la región Costa");

        }

    }
}
