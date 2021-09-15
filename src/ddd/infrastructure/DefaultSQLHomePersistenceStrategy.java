package ddd.infrastructure;

import ddd.domain.home.HomePersistenceStrategy;
import ddd.model.persistence.OPERATION;

import java.util.ArrayList;
import java.util.List;

//конкретная реализация SQL стратегии репозитория
public abstract class DefaultSQLHomePersistenceStrategy extends SQLHome implements HomePersistenceStrategy, DefaultSQLHomePersistence {
    ResultSet resultSet;
    List<HomeImpl> homes = new ArrayList<>();

    public abstract void prepareTo(OPERATION operation);
    public abstract void withResultSet(ResultSet resultSet);

    @Override
    public void getQuery() {}

    public void refresh() {
        /*
         * Работа с result set
         * доступ к модели на уровня поля
         * "123" это из resultSet
         * */
        this.filed = "123";
    }

    public void persist() {}

    public void merge() {}

    public void remove() {}

    @Override
    public void withEntities(List<HomeImpl> homes) {
        this.homes = homes;
    }
}