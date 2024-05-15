/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ventaproductos;
import java.util.Scanner;
/**
 *
 * @author marga
 */
public class mains {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        System.out.print("Ingrese la cantidad de productos: ");
        int cantidad = scanner.nextInt();

        // Crear un objeto Venta utilizando los valores ingresados
        ventaProducto venta = new ventaProducto(precio, cantidad);

        double descuento = calcularDescuento(venta);
        double precioFinal = calcularPrecioFinal(venta, descuento);

        System.out.printf("Descuento aplicado: %.2f%%\n", descuento * 100);
        System.out.printf("Precio final después del descuento: $%.2f\n", precioFinal);

        scanner.close();
    }

    public static double calcularDescuento(ventaProducto venta) {
        if (venta.getPrecio() >= 1000 && venta.getCantidad() >= 10) {
            return 0.10;
        } else {
            return 0.05;
        }
    }

    public static double calcularPrecioFinal(ventaProducto venta, double descuento) {
        double precioTotal = venta.getPrecio() * venta.getCantidad();
        double montoDescuento = precioTotal * descuento;
        return precioTotal - montoDescuento;
    }
}


        