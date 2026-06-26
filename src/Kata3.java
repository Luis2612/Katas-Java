import java.util.Scanner;

public class Kata3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // inicializar
        double subtotal = 0;
        double precioProducto = 0;
        int contadorProductos = 0;

        System.out.println("Sistema de Pedidos");

        // Bucle pedir precios
        do {
            System.out.print("Ingrese el precio o dé cero (0) para terminar: ");
            precioProducto = scanner.nextDouble();

            // Suma de precio
            if (precioProducto > 0) {
                subtotal = subtotal + precioProducto;
                contadorProductos = contadorProductos + 1;
            }

        } while (precioProducto != 0);

        // Cálcular Iva, subtotal
        double iva = subtotal * 0.19;
        double totalPrecio = subtotal + iva;
        double descuento = 0;
        double totalFinal = totalPrecio;

        // descuento
        if (totalPrecio > 50000) {
            descuento = totalPrecio * 0.10;
            totalFinal = totalPrecio - descuento;
        }

        // consola
        System.out.println("RESULTADO DE PEDIDO");
        System.out.println("Productos: " + contadorProductos);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("IVA (19%): $" + iva);
        System.out.println("Descuento (10%): $" + descuento);
        System.out.println("Total: $" + totalFinal);

        scanner.close();
    }
}