package ddd.infrastructure.repository;

import ddd.domain.persistence.IPersistenceStrategy;
import ddd.domain.repository.IHomeRepository;
import ddd.infrastructure.DefaultSQLPersistence;
import ddd.infrastructure.ResultSet;
import ddd.model.entity.IHome;

//конкретный репозиторий
public class SQLHomeRepository implements IHomeRepository {
    @Override
    public void findByFiled(String filed) {
        //поиск по имени
    }

    @Override
    public void explain(IPersistenceStrategy<IHome> defaultHomePersistenceStrategy){
        DefaultSQLPersistence defaultHomePersistenceStrategy1 = (DefaultSQLPersistence) defaultHomePersistenceStrategy;

        defaultHomePersistenceStrategy1.getQuery(); //выполнить запрос и вернет resultset
        ResultSet resultSet = new ResultSet();
        defaultHomePersistenceStrategy1.withResultSet(resultSet);
    }
}