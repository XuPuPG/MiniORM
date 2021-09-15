package ddd.infrastructure;

//для конкретной реализации в репозитории
public interface DefaultSQLPersistence {
    void withResultSet(ResultSet resultSet);
    void getQuery();
}