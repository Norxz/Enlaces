package main;

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
                                       3. Añadir todos los items de una lista a otra.
                                       4. Elimina todos los elementos de una lista.
                                       5. Verifica si el elemento existe en la lista.
                                       6. Retornar el elemento en la posicion especificada.
                                       7. Retornar el índice de la primer ocurrencia.
                                       8. Retornar verdadero si no contiene elementos.
                                       9. Retornar el índice de la última ocurrencia.
                                       10. Remover el elemento en la posicion especificada.
                                       11. Remover la primer ocurrencia del elemento especificado.
                                       12. Reemplazar el elemento en la posición especificada
                                       13. Retornar el numero de items.
                                       14. Retornar la porción indicada de items.
                                       15. Enseñar los elementos de la lista.
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
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    System.out.println("Ingrese la posición del elemento que desea eliminar.");
                    index = in.nextInt();
                    try {
                        String removedElement = ppal.list.remove(index);
                        System.out.println("El elemento " + removedElement + " ha sido eliminado.");
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Error: Índice fuera de los límites de la lista.");
                    }
                    break;
                case 11:
                    break;
                case 12:
                    break;
                case 13:
                    break;
                case 14:
                    break;
                case 15:
                    System.out.println("Los elementos son: ");
                    System.out.println(ppal.list.toString());
                    break;
                default:
                    System.out.println("Error. Por favor ingresa una opción válida.");

            }
        }
    }

}
