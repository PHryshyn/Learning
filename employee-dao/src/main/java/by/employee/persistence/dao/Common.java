package by.employee.persistence.dao;


import java.io.Serializable;

public interface Common<E, I extends Serializable> {
    void save(E e);
    void update(E e);
    void delete(I id);
}
