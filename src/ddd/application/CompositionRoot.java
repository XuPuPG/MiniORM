package ddd.application;

import ddd.domain.factory.IEntityFactory;
import ddd.domain.factory.IPersistenceStrategyFactory;
import ddd.domain.factory.IRepositoryFactory;
import ddd.infrastructure.factory.SQLEntityFactory;
import ddd.infrastructure.factory.SQLPersistenceStrategyFactory;
import ddd.infrastructure.factory.SQLRepositoryFactory;

public class CompositionRoot {
    SQLRepositoryFactory sqlRepositoryFactory;
    SQLEntityFactory sqlEntityFactory;
    SQLPersistenceStrategyFactory sqlPersistenceStrategyFactory;

    public CompositionRoot() {
        this.sqlEntityFactory = new SQLEntityFactory();
        this.sqlRepositoryFactory = new SQLRepositoryFactory();
        this.sqlPersistenceStrategyFactory = new SQLPersistenceStrategyFactory();
    }

    public IEntityFactory getEntityFactory(){
        return sqlEntityFactory;
    }
    public IRepositoryFactory getRepositoryFactory(){
        return sqlRepositoryFactory;
    }

    public IPersistenceStrategyFactory getPersistenceStrategyFactory() {
        return sqlPersistenceStrategyFactory;
    }
}
