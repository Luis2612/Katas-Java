import java.util.Scanner;

public class Kata1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el total de la cuenta: ");
        double totalCuenta = scanner.nextDouble();

        System.out.print("Ingresa el porcentaje de propina: ");
        double porcentajePropina = scanner.nextDouble();

        double montoPropina = totalCuenta * porcentajePropina / 100;
        double totalPagar = totalCuenta + montoPropina;

        System.out.println("Propina: $" + (int) montoPropina);
        System.out.println("Total a pagar: $" + (int) totalPagar);

        if (porcentajePropina > 30) {
            System.out.println("¡Propina generosa!");
        } else if (porcentajePropina < 5) {
            System.out.println("Propina muy baja");
        }

        scanner.close();
    }
}
