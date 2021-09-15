package ddd.infrastructure.repository;

import ddd.domain.persistence.IPersistenceStrategy;
import ddd.domain.repository.IHomeRepository;
import ddd.infrastructure.SQLPersistenceMapper;
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
        SQLPersistenceMapper defaultHomePersistenceStrategy1 = (SQLPersistenceMapper) defaultHomePersistenceStrategy;

        defaultHomePersistenceStrategy1.withResultSet(sql ->
        {
            //выполнить sql
            return new ResultSet();
        });
    }
}