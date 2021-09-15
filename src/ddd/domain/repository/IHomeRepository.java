package ddd.domain.repository;

import ddd.domain.persistence.IPersistenceStrategy;
import ddd.model.entity.IHome;

//интерфейс репозитория уровня домена
public interface IHomeRepository {
    void findByFiled(String filed);
    void explain(IPersistenceStrategy<IHome> defaultHomePersistenceStrategy);
}