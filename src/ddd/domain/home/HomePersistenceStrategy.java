package ddd.domain.home;

import ddd.infrastructure.HomeImpl;
import ddd.model.persistence.OPERATION;

import java.util.List;

//индивидуально для каждой сущности
public interface HomePersistenceStrategy {
    void prepareTo(OPERATION operation);
    void withEntities(List<HomeImpl> homes);
}
