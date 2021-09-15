package ddd.domain.persistence;

import ddd.model.persistence.OPERATION;

import java.util.List;

public interface IPersistenceStrategy<T> {
    void prepareTo(OPERATION operation);
    void withEntity(T entity);
    void withEntities(List<T> entities);
}
