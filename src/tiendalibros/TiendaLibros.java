package tiendalibros;

import java.util.Scanner;

public class TiendaLibros {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        System.out.println("Ingresa el nombre: ");
        String nombre = consola.nextLine();

        System.out.println("Ingresa el ID: ");
        int id = Integer.parseInt(consola.nextLine());

        System.out.println("Ingresa el precio: ");
        double precio = Double.parseDouble(consola.nextLine());

        System.out.println("Ingresa el símbolo monetario: ");
        char simbolo = consola.nextLine().charAt(0);

        System.out.println("Ingresa si el envío es gratuito: ");
        boolean envioGratuito = Boolean.parseBoolean(consola.nextLine());

        System.out.println("Nombre del libro e identificador: " + nombre + " #" + id);
        System.out.println("Precio: " + simbolo + " " + precio);
        System.out.println("Envío gratuito: " + envioGratuito);
    }
}
