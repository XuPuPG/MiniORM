package ddd.domain.factory;

import ddd.domain.persistence.IPersistenceStrategy;
import ddd.model.entity.IHome;

public interface IPersistenceStrategyFactory {
    IPersistenceStrategy<IHome> getDefaultHomePersistenceStrategy();
    void getSOME_ENTITY_PersistenceStrategy();
}