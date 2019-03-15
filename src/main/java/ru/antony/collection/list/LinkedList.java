package ru.antony.collection.list;

import ru.antony.collection.Collection;

public class LinkedList<T> implements Collection<T> {

    private class Elem<T> {
        T item;
        Elem<T> next;
        Elem<T> prev;

        public Elem(T item, Elem<T> next, Elem<T> prev) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }


    private int size;
    private Elem<T> first;
    private Elem<T> last;


    public LinkedList() {
        this.size = 0;

    }

    public void add(T object) {
        if(first == null){
            first = new Elem<T>(object, null, null);
            last = first;
            size++;
        } else {
            Elem<T> local = new Elem<T>(object, null, last);
            last.next = local;
            last = local;
            size++;
        }
    }

    public void clear() {

    }

    public T[] toArray() {
        T[] array = (T[])(new Object[size]);

        array[0] = first.item;

        Elem<T> local = first;
        for(int i = 1; i < size; i++ ){
            local = local.next;
            array[i] = local.item;
        }

        return array;
    }

    public boolean isEmpty() {
        return false;
    }

    public int size() {
        return size;
    }

    public T getFirst() {
        return first.item;
    }

    public T getLast() {
        return last.item;
    }
}
