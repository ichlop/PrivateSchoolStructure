package main.dao.implement;

import java.util.List;

public interface DaoRepository<T> {

    default List<T> createPerson() {
        return null;
    }

    void personCreation();

    void deletePerson();
}
