import java.util.Scanner;

public class Kata6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalClientes = 0;
        int contadorHoras = 0;
        int horaMaxClientes = -1;
        int maxClientes = 0;

        while (true) {
            System.out.print("Ingresa la hora (0-23, -1 para terminar): ");
            int hora = scanner.nextInt();

            if (hora == -1) {
                break;
            }

            System.out.print("Ingresa el número de clientes en esa hora: ");
            int clientes = scanner.nextInt();

            totalClientes += clientes;
            contadorHoras++;

            if (clientes > maxClientes) {
                maxClientes = clientes;
                horaMaxClientes = hora;
            }
        }

        if (contadorHoras > 0) {
            double promedio = (double) totalClientes / contadorHoras;

            System.out.println("Reporte de Clientes");
            System.out.println("Total de clientes: " + totalClientes);
            System.out.printf("Promedio por hora: %.2f%n", promedio);
            System.out.println("Hora con más clientes: " + horaMaxClientes + " (" + maxClientes + " clientes)");
        } else {
            System.out.println("No se ingresaron datos.");
        }

        scanner.close();
    }
}
