package ru.antony.collection.list;

import ru.antony.collection.Collection;

public class LinkedList implements Collection {

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
    private Elem<Object> first;
    private Elem<Object> last;



    public void add(Object object) {
        if(first == null){
            first = new Elem<Object>(object, null, null);
            last = first;
            size++;
        } else {
            Elem<Object> local = new Elem<Object>(object, null, last);
            last.next = local;
            last = local;
            size++;
        }
    }

    public void clear() {

    }

    public Object[] toArray() {
        Object[] array = new Object[size];

        array[0] = first.item;

        Elem<Object> local = first;
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
}
