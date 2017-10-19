package ru.itpark;

public interface List {
    void add(int element);
    void delete(int index);
    int returnIndex(int element);
    void addByIndex( int index, int element);
    void returnObject(Iterator iterator);
}
