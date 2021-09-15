package ddd.model.common;

import ddd.domain.home.HomePersistenceStrategy;
import ddd.model.persistence.PERSIST;

public interface PersistenceEntity{
    HomePersistenceStrategy getPersistenceStrategy();
    void setPersistenceStrategy(HomePersistenceStrategy homePersistenceStrategy);
    PERSIST getPersist();
}