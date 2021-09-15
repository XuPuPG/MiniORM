package ddd.infrastructure.factory;

import ddd.domain.factory.IPersistenceStrategyFactory;
import ddd.domain.persistence.IPersistenceStrategy;
import ddd.infrastructure.impl.DefaultHomeSQLPersistenceStrategy;
import ddd.model.entity.IHome;

public class SQLPersistenceStrategyFactory implements IPersistenceStrategyFactory {
    @Override
    public IPersistenceStrategy<IHome> getDefaultHomePersistenceStrategy() {
        return new DefaultHomeSQLPersistenceStrategy();
    }

    @Override
    public void getSOME_ENTITY_PersistenceStrategy() { }
}
