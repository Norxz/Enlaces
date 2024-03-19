package methods;

import java.util.Iterator;

/**
 * Esta clase implementa la pila mediante nodos.
 *
 * @param <Item> Tipo de los elementos almacenados en la pila.
 *
 * @author Norxz
 */
public class List<Item> implements Iterable<Item> {

    Node first;
    Node last;
    int count;

    private class Node {

        Item item;
        Node next;
        Node prev;
    }

    /**
     * Constructor que inicializa una pila vacía.
     */
    public List() {
        first = null;
        last = null;
        count = 0;
    }

    /**
     * Agrega un elemento a la pila.
     *
     * @param item El elemento a agregar.
     */
    public void push(Item item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        if (oldfirst != null) {
            oldfirst.prev = first;
        }
        if (last == null) {
            last= first;
        }else{
            first.prev = last;
            last.next = first;
        }
        count++;
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
        }else{
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
            return current  != null;
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
}
