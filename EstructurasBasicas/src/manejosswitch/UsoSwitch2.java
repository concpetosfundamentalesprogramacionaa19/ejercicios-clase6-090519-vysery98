package manejosswitch;

/**
 *
 * @author vysery98
 */
public class UsoSwitch2 {

    public static void main(String[] args) {

        int contador = 5;

        switch (contador) {
            case 1:
                System.out.printf("Día %s\n", "Lunes");
                break;

            case 2:
                System.out.printf("Día %s\n", "Martes");
                break;

            case 3:
                System.out.printf("Día %s\n", "Miercóles");
                break;

            case 4:
                System.out.printf("Día %s\n", "Jueves");
                break;

            default:
                System.out.println("ninguna de las anteriores");

        }

    }
}
