package ddd.model.common;

import ddd.model.persistence.PERSIST;

public interface IPersistenceEntitySettings {
    /**
     * Метод получения статуса персистентности сущности
     * @return статус персистентности для текущего экземпляра сущности
     */
    void setPersist(PERSIST PERSISTENCE);
}