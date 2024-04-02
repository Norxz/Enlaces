package main;

import java.util.Iterator;
import methods.List;

import java.util.Scanner;

public class Principal {

    List<String> list;

    public Principal() {
        list = new List<>();
    }

    private String generarNombre() {
        String[] nombres = {"Mohhamed", "Jorge", "Ako", "Santiago", "Manuel", "Aspi", "Andres", "Carolina", "Sebastián", "Felipe", "Camilo", "Miguel", "Ana", "Alberto", "Paola"};
        String[] apellidos = {"Mclovin", "Borda", "Cusguen", "Parra", "Mejia", "Viana", "Ortiga", "Ramírez", "Riveros", "Sanabria", "Alvarez", "Pardo"};
        return nombres[(int) (Math.random() * nombres.length)] + " " + apellidos[(int) (Math.random() * apellidos.length)];
    }

    public static void main(String[] args) {
        int option, index;
        Principal ppal;
        String nombre;
        Scanner in = new Scanner(System.in);

        ppal = new Principal();

        System.out.println("¡BIENVENIDO A LA LISTA!");

        while (true) {
            option = 0;
            System.out.println("""
                                       Por favor, ingrese una opción:
                                       1. Insertar dato en una posición indicada.
                                       2. Insertar dato al final de la lista
                                       3. Remover el elemento en la posicion especificada.
                                       4. Enseñar los elementos de la lista.
                                       5. Recorrer la lista en orden inverso.
                                       6. Recorre la lista orden normal.
                                       """);
            option = in.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Ingrese la posición donde desea ingresar el elemento.");
                    index = in.nextInt();
                    nombre = ppal.generarNombre();
                    System.out.println("Se adicióno el dato: " + nombre + "\n");
                    ppal.list.add(nombre, index);
                    break;
                case 2:
                    nombre = ppal.generarNombre();
                    ppal.list.add(nombre);
                    System.out.println("El elemento " + nombre + " ha sido añadido.");
                    break;
                case 3:
                    System.out.println("Ingrese la posición del elemento que desea eliminar.");
                    index = in.nextInt();
                    try {
                        String removedElement = ppal.list.remove(index);
                        System.out.println("El elemento " + removedElement + " ha sido eliminado.");
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Error: Índice fuera de los límites de la lista.");
                    }
                    break;
                case 4:
                    System.out.println("Los elementos son: ");
                    System.out.println(ppal.list.toString());
                    break;
                case 5:
                    System.out.println("Recorriendo la lista en orden inverso:");
                    Iterator<String> reverseIterator = ppal.list.reverseIterator();
                    while (reverseIterator.hasNext()) {
                        System.out.println(reverseIterator.next());
                    }
                    break;
                case 6:
                    System.out.println("Recorriendo la lista en orden normal:");
                    Iterator<String> iterator = ppal.list.iterator();
                    while (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }
                    break;
                default:
                    System.out.println("Error. Por favor ingresa una opción válida.");
            }
        }
    }
}
