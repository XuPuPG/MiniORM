package ddd.infrastructure.impl;

import ddd.domain.persistence.IPersistenceStrategy;
import ddd.infrastructure.SQLPersistenceMapper;
import ddd.infrastructure.ResultSet;
import ddd.infrastructure.SQLHome;
import ddd.model.entity.IHome;
import ddd.model.persistence.OPERATION;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;

//конкретная реализация SQL стратегии репозитория
public class DefaultHomeSQLPersistenceStrategy implements SQLPersistenceMapper, IPersistenceStrategy<IHome> {
    OPERATION operation;
    List<IHome> homes;

    public void refresh(Function<String, ResultSet> queryResult) {
        ResultSet resultSet = queryResult.apply("SELECT FROM....");
        /*
         * Работа с result set
         * доступ к модели на уровня поля
         * "123" это из resultSet
         * */

        homes.forEach(x-> {
            if(x!=null)
                ((SQLHome) x).filed = "123";
        });
    }

    public void persist(Function<String, ResultSet> queryResult) {}

    public void merge(Function<String, ResultSet> queryResult) {}

    public void remove(Function<String, ResultSet> queryResult) {}

    @Override
    public void prepareEntity(IHome home, OPERATION operation) {
        this.homes = Collections.singletonList(home);
    }

    @Override
    public void prepareEntities(List<IHome> homes, OPERATION operation) {
        this.homes = Collections.unmodifiableList(homes);
    }

    @Override
    public void withResultSet(Function<String, ResultSet> queryResult) {
        switch (operation){
            case REFRESH:
                refresh(queryResult);
                break;
            case PERSIST:
                persist(queryResult);
                break;
            case MERGE:
                merge(queryResult);
                break;
            case REMOVE:
                remove(queryResult);
                break;
        }
    }

    @Override
    public void prepareTo(OPERATION operation) {
        this.operation = operation;
    }
}