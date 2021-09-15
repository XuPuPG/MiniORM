package ddd.infrastructure;

import ddd.model.persistence.OPERATION;

public class ManagedSQLDefaultPersistenceStrategy extends DefaultSQLHomePersistenceStrategy {
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
