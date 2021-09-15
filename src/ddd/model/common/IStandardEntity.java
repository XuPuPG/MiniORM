package ddd.model.common;

public interface IStandardEntity<T> {
    /**
     * Уникальный идентификатор сущности
     * @return идентификатор сущности
     */
    T getId();
}