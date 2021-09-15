package ddd.model.common;

import ddd.domain.persistence.IPersistenceStrategy;
import ddd.model.persistence.PERSIST;

public interface PersistenceEntity<T>{
    IPersistenceStrategy<T> getPersistenceStrategy();
    void setPersistenceStrategy(IPersistenceStrategy<T> homePersistenceStrategy);
    PERSIST getPersist();
}