package ddd.infrastructure.factory;

import ddd.domain.factory.IPersistenceStrategyFactory;
import ddd.infrastructure.impl.SQLHomePersistenceStrategies;
import ddd.model.common.IPersistenceStrategy;
import ddd.model.entity.IHome;

public class SQLPersistenceStrategyFactory implements IPersistenceStrategyFactory {
    @Override
    public IPersistenceStrategy<IHome> getDefaultHomePersistenceStrategy() {
        return new SQLHomePersistenceStrategies.DefaultHomeSQLPersistenceStrategy();
    }

    @Override
    public void getSOME_ENTITY_PersistenceStrategy() { }
}
