package ddd.infrastructure;

import ddd.domain.persistence.IPersistenceStrategy;
import ddd.model.entity.IHome;
import ddd.model.persistence.OPERATION;

import java.util.ArrayList;
import java.util.List;

//конкретная реализация SQL стратегии репозитория
public class DefaultHomeSQLPersistenceStrategy implements DefaultSQLPersistence, IPersistenceStrategy<IHome> {
    ResultSet resultSet;
    SQLHome home;
    List<? extends IHome> homes = new ArrayList<>();

    @Override
    public void getQuery() {}

    public void refresh() {
        /*
         * Работа с result set
         * доступ к модели на уровня поля
         * "123" это из resultSet
         * */

        home.filed = "123";
    }

    public void persist() {}

    public void merge() {}

    public void remove() {}

    @Override
    public void withEntity(IHome home) {
        this.home = (SQLHome) home;
    }

    @Override
    public void withEntities(List<IHome> homes) {
        this.homes = homes;
    }

    OPERATION operation;

    @Override
    public void withResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
        switch (operation){
            case REFRESH:
                refresh();
                break;
            case PERSIST:
                persist();
                break;
            case MERGE:
                merge();
                break;
            case REMOVE:
                remove();
                break;
        }

        this.operation = null;
    }

    @Override
    public void prepareTo(OPERATION operation) {
        this.operation = operation;
    }
}