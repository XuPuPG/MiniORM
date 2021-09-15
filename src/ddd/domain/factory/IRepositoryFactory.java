package ddd.domain.factory;

import ddd.domain.repository.IHomeRepository;

public interface IRepositoryFactory {
    IHomeRepository getHomeRepository();
}
