import java.util.Scanner;

//* Ejercicio 3.12 - CLase Factura *//
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Pedir al usuario los valores para crear la Factura
        System.out.print("Ingresa el número de pieza: ");
        String numeroPieza = scanner.nextLine(); // Leer String
        System.out.print("Ingresa la descripción de la pieza: ");
        String descripcionPieza = scanner.nextLine(); // Leer String
        System.out.print("Ingresa la cantidad: ");
        int cantidad = scanner.nextInt(); // Leer int
        System.out.print("Ingresa el precio por artículo: ");
        double precioPorArticulo = scanner.nextDouble(); // Leer double

        Factura factura1 = new Factura(numeroPieza, descripcionPieza, cantidad, precioPorArticulo);
        System.out.println("\nFactura 1:");
        System.out.println("Número de pieza: " + factura1.getNumeroPieza());
        System.out.println("Descripción: " + factura1.getDescripcionPieza());
        System.out.println("Cantidad: " + factura1.getCantidad());
        System.out.println("Precio por artículo: " + factura1.getPrecioPorArticulo());
        System.out.println("Monto de la factura: " + factura1.obtenerMontoFactura());

        factura1.setCantidad(-5);
        factura1.setPrecioPorArticulo(-5.50);

        System.out.println("\nFactura (-):");
        System.out.println("Número de pieza: " + factura1.getNumeroPieza());
        System.out.println("Descripción: " + factura1.getDescripcionPieza());
        System.out.println("Cantidad: " + factura1.getCantidad());
        System.out.println("Precio por artículo: " + factura1.getPrecioPorArticulo());
        System.out.println("Monto de la factura: " + factura1.obtenerMontoFactura());
    }
}