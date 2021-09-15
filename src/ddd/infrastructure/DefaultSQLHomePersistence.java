package ddd.infrastructure;

import ddd.domain.home.HomePersistenceStrategy;

//для конкретной реализации в репозитории
public interface DefaultSQLHomePersistence extends HomePersistenceStrategy {
    void withResultSet(ResultSet resultSet);
    void getQuery();
}