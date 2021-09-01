package main.dao.implement;

import java.util.List;

public interface DaoRepository<T> {

    default List<T> createSomething() {
        return null;
    }

    void somethingCreation();

    void deleteSomething();
}
