package ddd.domain.repository;

import ddd.model.common.IPersistenceStrategy;
import ddd.model.entity.IHome;

//интерфейс репозитория уровня домена
public interface IHomeRepository<T extends IHome> {
    void findByFiled(String filed);

    /**
     * Выполняет заданную операцию постоянства с сущностью
     * @param defaultHomePersistenceStrategy настроенная стратегия, должна содержать сущность и
     */
    void explain(IPersistenceStrategy<T> defaultHomePersistenceStrategy);
}