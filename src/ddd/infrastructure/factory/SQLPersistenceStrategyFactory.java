package ddd.infrastructure.factory;

import ddd.domain.factory.PersistenceStrategyFactory;
import ddd.domain.home.IPersistenceStrategy;
import ddd.infrastructure.DefaultHomeSQLPersistenceStrategy;
import ddd.infrastructure.SQLHome;
import ddd.model.entity.IHome;

public class SQLPersistenceStrategyFactory implements PersistenceStrategyFactory {
    @Override
    public IPersistenceStrategy<IHome> getDefaultHomePersistenceStrategy() {
        return new DefaultHomeSQLPersistenceStrategy();
    }

    @Override
    public void getSOME_ENTITY_PersistenceStrategy() { }
}
