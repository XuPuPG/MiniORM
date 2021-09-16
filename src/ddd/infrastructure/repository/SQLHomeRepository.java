package ddd.infrastructure.repository;

import ddd.infrastructure.SQLHome;
import ddd.model.common.IPersistenceStrategy;
import ddd.domain.repository.IHomeRepository;
import ddd.infrastructure.SQLPersistenceMapper;
import ddd.infrastructure.ResultSet;

//конкретный репозиторий
public class SQLHomeRepository implements IHomeRepository<SQLHome> {
    @Override
    public void findByFiled(String filed) {
        //поиск по имени
    }

    @Override
    public void explain(IPersistenceStrategy<SQLHome> defaultHomePersistenceStrategy){
        SQLPersistenceMapper defaultHomePersistenceStrategy1 = (SQLPersistenceMapper) defaultHomePersistenceStrategy;

        defaultHomePersistenceStrategy1.withResultSet(sql ->
        {
            //выполнить sql
            return new ResultSet();
        });
    }
}