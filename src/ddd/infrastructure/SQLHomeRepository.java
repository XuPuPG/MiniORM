package ddd.infrastructure;

import ddd.domain.home.HomePersistenceStrategy;
import ddd.domain.repository.IHomeRepository;

//конкретный репозиторий
public class SQLHomeRepository implements IHomeRepository {
    @Override
    public void findByFiled(String filed) {
        //поиск по имени
    }

    @Override
    public void explain(HomePersistenceStrategy defaultHomePersistenceStrategy){
        DefaultSQLHomePersistence defaultHomePersistenceStrategy1 = (DefaultSQLHomePersistence) defaultHomePersistenceStrategy;

        defaultHomePersistenceStrategy1.getQuery(); //выполнить запрос и вернет resultset
        ResultSet resultSet = new ResultSet();
        defaultHomePersistenceStrategy1.withResultSet(resultSet);
    }
}