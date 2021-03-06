package ru.antony.collection;

public interface Collection<T> {

    void add(T object);

    void clear();

    T[] toArray();

    boolean isEmpty();

    int size();

    T getFirst();

    T getLast();

    T get(int index);

    void delete(int index);
}
