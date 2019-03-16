package ru.antony.collection.list;

import ru.antony.collection.Collection;

import java.lang.reflect.Array;

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

    private T[] getTypeArray(Class<T> c, int s) {
        @SuppressWarnings("unchecked")
        T[] a = (T[]) Array.newInstance(c, s);
        return a;
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
        first = null;
        last = null;
        size = 0;
    }

    public T[] toArray() {
        T[] array = getTypeArray((Class<T>) first.item.getClass(), size);

        array[0] = first.item;

        Elem<T> local = first;
        for(int i = 1; i < size; i++ ){
            local = local.next;
            array[i] = local.item;
        }

        return array;
    }

    public boolean isEmpty() {
        if(first == null){
            return true;
        }

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

    public T get(int index) {

        if(index >= size || index < 0){
            throw new IndexOutOfBoundsException();
        }

        Elem<T> local = first;

        for(int i = 0; i < index; i++){
            local = local.next;
        }

        return local.item;
    }
}
