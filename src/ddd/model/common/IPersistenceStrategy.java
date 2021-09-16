package ddd.model.common;

import ddd.model.persistence.OPERATION;

import java.util.List;

public interface IPersistenceStrategy<T> {
    void prepareTo(OPERATION operation);
    void prepareEntity(T entity, OPERATION operation);
    void prepareEntities(List<T> entities, OPERATION operation);
}
