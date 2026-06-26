import java.util.Scanner;

public class Kata4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ingresa el día (1=Lunes, 7=Domingo): ");
        int dia = sc.nextInt();

        System.out.print("ingresa la hora (0-23): ");
        int hora = sc.nextInt();

        switch (dia) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                if (hora >= 6 && hora < 20) {
                    System.out.println("La cafetería está abierta.");
                    System.out.println("horario de lunes a viernes de 6:00 AM a 8:00 PM");
                } else {
                    System.out.println("La cafetería está cerrada.");
                    System.out.println("horario de lunes a viernes de 6:00 AM a 8:00 PM");
                }
                break;
            case 6:
                if (hora >= 7 && hora < 14) {
                    System.out.println("La cafetería está abierta.");
                    System.out.println("horario de sábado de 7:00 AM - 2:00 PM");
                } else {
                    System.out.println("La cafetería está cerrada.");
                    System.out.println("horario de sábado de 7:00 AM - 2:00 PM");
                }
                break;
            case 7:
                System.out.println("La cafetería está cerrada (domingos cerrado).");
                break;

            default:
                System.out.println("Día inválido. Debe ser entre 1 y 7.");
        }

        sc.close();
    }

}