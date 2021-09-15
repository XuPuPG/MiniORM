package ddd.infrastructure;

import ddd.domain.persistence.IPersistenceStrategy;
import ddd.infrastructure.impl.HomeImpl;
import ddd.model.common.IPersistenceEntitySettings;
import ddd.model.entity.IHome;
import ddd.model.persistence.PERSIST;

//sql сущность
public class SQLHome extends HomeImpl implements IPersistenceEntitySettings {
    //стратегия работы с данными
    IPersistenceStrategy<IHome> managedSQLDefaultPersistenceStrategy;
    PERSIST PERSISTENCE;

    @Override
    public void setNumber(int number) {
        super.setNumber(number);
        if(PERSISTENCE == PERSIST.PERSISTENCE){
            // sql запрос в базу который обновит номер
        }
    }

    @Override
    public IPersistenceStrategy<IHome> getPersistenceStrategy() {
        return managedSQLDefaultPersistenceStrategy;
    }


    @Override
    public PERSIST getPersist() {
        return PERSISTENCE;
    }

    @Override
    public void setPersistenceStrategy(IPersistenceStrategy<IHome> homePersistenceStrategy) {
        this.managedSQLDefaultPersistenceStrategy = homePersistenceStrategy;
    }

    @Override
    public void setPersist(PERSIST PERSISTENCE) {
        this.PERSISTENCE = PERSISTENCE;
    }
}