package ddd.infrastructure;

import ddd.domain.home.HomePersistenceStrategy;
import ddd.model.common.IPersistenceEntitySettings;
import ddd.model.persistence.PERSIST;

//sql сущность
public class SQLHome extends HomeImpl implements IPersistenceEntitySettings {
    //стратегия работы с данными
    ManagedSQLDefaultPersistenceStrategy managedSQLDefaultPersistenceStrategy;
    PERSIST PERSISTENCE;

    @Override
    public void setNumber(int number) {
        super.setNumber(number);
        if(PERSISTENCE == PERSIST.PERSISTENCE){
            // sql запрос в базу который обновит номер
        }
    }

    @Override
    public HomePersistenceStrategy getPersistenceStrategy() {
        return managedSQLDefaultPersistenceStrategy;
    }

    @Override
    public PERSIST getPersist() {
        return PERSISTENCE;
    }

    @Override
    public void setPersistenceStrategy(HomePersistenceStrategy homePersistenceStrategy) {
        this.managedSQLDefaultPersistenceStrategy = (ManagedSQLDefaultPersistenceStrategy) homePersistenceStrategy;
    }

    @Override
    public void setPersist(PERSIST PERSISTENCE) {
        this.PERSISTENCE = PERSISTENCE;
    }
}