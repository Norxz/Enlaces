package methods;

import java.util.Iterator;

/**
 * Esta clase implementa la lista mediante nodos.
 *
 * @param <Item> Tipo de los elementos almacenados en la lista.
 *
 * @author Norxz
 */
public class List<Item> implements Iterable<Item> {

    private Node first, last, current;
    private int count, countAdd;

    /**
     * Crea el nodo con el item y las referencias
     */
    private class Node {

        Item item;
        Node next;
        Node prev;
    }

    /**
     * Constructor que inicializa una lista vacía.
     */
    public List() {
        first = null;
        last = null;
        count = 0;
    }

    /**
     * Añade el elemento al final
     *
     * @param element
     */
    public void add(Item element) {
        Node newElement = new Node();
        newElement.item = element;
        newElement.prev = last;
        last = newElement;
        newElement.next = first;
        count++;
    }

    public boolean add(Item element, int index) {
        if (index < count) {
            return false;
        } else {
            Node newElement = new Node();
            newElement.item = element;

            current = first;
            countAdd = 0;
            
            while (countAdd < index) {
                current = current.next;
                countAdd++;
            }
            newElement.next = current.next;
            newElement.prev = current.prev;

            if (current.next != null) {
                current.next.prev = newElement;
            }
            current.next = newElement;

            count++;
            return true;
        }
    }

    /**
     * Agrega un elemento a la pila.
     *
     * @param item El elemento a agregar.
     */
    public void push(Item item) {

    }

    /**
     * Elimina y retorna el elemento superior de la pila.
     *
     * @return El elemento superior de la pila.
     */
    public Item pop() {
        Item item = first.item;
        first.item = null;
        first = first.next;
        if (first != null) {
            first.prev = last;
            last.next = first;
        } else {
            last = null;
        }
        count--;
        return item;
    }

    /**
     * Retorna el elemento superior de la pila sin eliminarlo.
     *
     * @return El elemento superior de la pila.
     */
    public Item peek() {
        return first.item;
    }

    /**
     * Verifica si la pila está vacía.
     *
     * @return true si la pila está vacía, false de lo contrario.
     */
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * Retorna el número de elementos en la pila.
     *
     * @return El número de elementos en la pila.
     */
    public int size() {
        return count;
    }

    /**
     * Retorna un iterador sobre los elementos de la pila.
     *
     * @return Un iterador sobre los elementos de la pila.
     */
    @Override
    public Iterator<Item> iterator() {
        return new LLIterator();
    }

    private class LLIterator implements Iterator<Item> {

        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
}
