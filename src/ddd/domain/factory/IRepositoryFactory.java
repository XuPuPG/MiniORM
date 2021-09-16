package ddd.domain.factory;

import ddd.domain.repository.IHomeRepository;
import ddd.model.entity.IHome;

public interface IRepositoryFactory {
    IHomeRepository<IHome> getHomeRepository();
}
