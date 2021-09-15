package ddd.infrastructure.factory;

import ddd.domain.home.HomePersistenceStrategy;
import ddd.domain.factory.PersistenceStrategyFactory;
import ddd.infrastructure.ManagedSQLDefaultPersistenceStrategy;

public class SQLPersistenceStrategyFactory implements PersistenceStrategyFactory {
    @Override
    public HomePersistenceStrategy getDefaultHomePersistenceStrategy() {
        return new ManagedSQLDefaultPersistenceStrategy();
    }

    @Override
    public void getSOME_ENTITY_PersistenceStrategy() { }
}
