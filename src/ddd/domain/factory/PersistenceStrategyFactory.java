package ddd.domain.factory;

import ddd.domain.home.HomePersistenceStrategy;

public interface PersistenceStrategyFactory{
    HomePersistenceStrategy getDefaultHomePersistenceStrategy();
    void getSOME_ENTITY_PersistenceStrategy();
}