package ddd.infrastructure.factory;

import ddd.domain.repository.IHomeRepository;
import ddd.domain.factory.IRepositoryFactory;
import ddd.infrastructure.repository.SQLHomeRepository;

public class SQLRepositoryFactory implements IRepositoryFactory {
    @Override
    public IHomeRepository getHomeRepository() {
        return new SQLHomeRepository();
    }
}
