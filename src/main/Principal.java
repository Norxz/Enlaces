package main;

import methods.List;

import java.util.Scanner;

/**
 *
 * @author espin
 */
public class Principal {

    List<List> list;
    
    /**
     * Constructor del método lista
     */
    public Principal(){
        list = new List<>();
    }
    
    /**
     * Genera los nombres que serán agregados a la lista
     *
     * @return
     */
    private String generarNombre() {
        String[] nombres = {"Mohhamed", "Andres", "Carolina", "Sebastián", "Felipe", "Camilo", "Miguel", "Ana", "Alberto", "Paola"};
        String[] apellidos = {"Mclovin","Parra", "Mejia", "Viana", "Ramírez", "Riveros", "Sanabria", "Alvarez", "Pardo"};
        return nombres[(int) (Math.random() * nombres.length)] + " " + apellidos[(int) (Math.random() * apellidos.length)];
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        int option;
        List list;
        Scanner in = new Scanner(System.in);

        System.out.println("¡BIENVENIDO A LA LISTA!");

        while (true) {
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
                                       """);
            option = in.nextInt();
            switch (option) {
                case 1:
                    break;
                case 2:
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
                    break;
                case 11:
                    break;
                case 12:
                    break;
                case 13:
                    break;
                case 14:
                    break;
                default:
                    System.out.println("Error. Por favor ingresa una opción válida.");

            }
        }
    }

}
