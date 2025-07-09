package fr.eni.eni_tp_java_spring_boot.controllers;

public interface BaseController<T> {
    Iterable<T> index();
    T show(String id);
    T create(T entity);
    T update(String id, T entity);
    void delete(String id);
}
