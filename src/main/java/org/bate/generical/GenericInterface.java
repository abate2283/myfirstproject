package org.bate.generical;

public interface GenericInterface <T>{

     T getAll();
     T getAll(T t);
    T save();
    T saveById(T t);

    void get(T t);
}
