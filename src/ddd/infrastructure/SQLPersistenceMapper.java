package ddd.infrastructure;

import java.util.function.Function;

//для конкретной реализации в репозитории
public interface SQLPersistenceMapper {
    void withResultSet(Function<String, ResultSet> queryResult);
}