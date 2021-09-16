package ddd.model.common;

import ddd.model.persistence.PERSIST;

public interface PersistenceEntity<T>{
    IPersistenceStrategy<T> getPersistenceStrategy();
    void setPersistenceStrategy(IPersistenceStrategy<T> homePersistenceStrategy);
    PERSIST getPersist();
}