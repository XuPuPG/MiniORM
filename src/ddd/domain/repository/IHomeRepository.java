package ddd.domain.repository;

import ddd.domain.home.HomePersistenceStrategy;

//интерфейс репозитория уровня домена
public interface IHomeRepository {
    void findByFiled(String filed);
    void explain(HomePersistenceStrategy defaultHomePersistenceStrategy);
}