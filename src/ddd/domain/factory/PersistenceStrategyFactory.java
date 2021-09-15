package ddd.domain.factory;

import ddd.domain.persistence.IPersistenceStrategy;
import ddd.model.entity.IHome;

public interface PersistenceStrategyFactory{
    <T extends IHome> IPersistenceStrategy<T> getDefaultHomePersistenceStrategy();
    void getSOME_ENTITY_PersistenceStrategy();
}