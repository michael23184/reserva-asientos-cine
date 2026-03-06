import java.util.Scanner;

public class Cine {

    public static void main(String[] args) {

        int filas = 3;
        int columnas = 4;

        String[][] sala = new String[filas][columnas];

        // Inicializar asientos
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sala[i][j] = "[ ]";
            }
        }

        // Mostrar sala inicial
        System.out.println("Estado inicial de la sala:");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(sala[i][j] + " ");
            }
            System.out.println();
        }

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la fila (0-2): ");
        int fila = entrada.nextInt();

        System.out.println("Ingrese la columna (0-3): ");
        int columna = entrada.nextInt();

        // Reservar asiento
        sala[fila][columna] = "[X]";

        // Mostrar sala actualizada
        System.out.println("Sala después de la reserva:");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(sala[i][j] + " ");
            }
            System.out.println();
        }
    }
}