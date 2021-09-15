package ddd.application;

import ddd.domain.factory.IEntityFactory;
import ddd.domain.factory.IRepositoryFactory;
import ddd.infrastructure.factory.SQLEntityFactory;
import ddd.infrastructure.factory.SQLRepositoryFactory;

public class CompositionRoot {
    SQLRepositoryFactory sqlRepositoryFactory;
    SQLEntityFactory sqlEntityFactory;

    public CompositionRoot() {
        this.sqlEntityFactory = new SQLEntityFactory();
        this.sqlRepositoryFactory = new SQLRepositoryFactory();
    }

    public IEntityFactory getEntityFactory(){
        return sqlEntityFactory;
    }
    public IRepositoryFactory getRepositoryFactory(){
        return sqlRepositoryFactory;
    }

}
