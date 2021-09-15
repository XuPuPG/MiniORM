package ddd.infrastructure.factory;

import ddd.domain.factory.IEntityFactory;
import ddd.infrastructure.SQLHome;
import ddd.model.entity.IHome;
import ddd.model.persistence.PERSIST;

public class SQLEntityFactory implements IEntityFactory {
    @Override
    public IHome createHome() {
        SQLHome sqlHome = new SQLHome();
        sqlHome.setPersist(PERSIST.TRANSIENT);
        return sqlHome;
    }
}
