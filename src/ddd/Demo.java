package ddd;

import ddd.application.CompositionRoot;
import ddd.domain.repository.IHomeRepository;
import ddd.domain.factory.PersistenceStrategyFactory;
import ddd.infrastructure.SQLHome;
import ddd.infrastructure.SQLHomeRepository;
import ddd.infrastructure.factory.SQLPersistenceStrategyFactory;
import ddd.infrastructure.HomeImpl;
import ddd.model.entity.IHome;
import ddd.model.persistence.OPERATION;

public class Demo {

    public static void main(String[] args) {

        CompositionRoot compositionRoot = new CompositionRoot();

        IHome home = compositionRoot.getEntityFactory().createHome();
        IHomeRepository homeRepository = compositionRoot.getRepositoryFactory().getHomeRepository();
        PersistenceStrategyFactory sqlPersistenceStrategyFactory = new SQLPersistenceStrategyFactory();

        //стратегия операций над сущностью, загрузка, слияние, обновление, добавление
        //стратегию всегда можно поменять или написать новую для более направленного получения данных из базы
        home.setPersistenceStrategy(sqlPersistenceStrategyFactory.getDefaultHomePersistenceStrategy());

        //добавление в базу только что полученной сущности
        home.getPersistenceStrategy().prepareTo(OPERATION.REFRESH);
        homeRepository.explain(home.getPersistenceStrategy());

        //меняем
        home.setNumber(4);

        //обновление сущности в базе
        home.getPersistenceStrategy().prepareTo(OPERATION.MERGE);
        homeRepository.explain(home.getPersistenceStrategy());

    }
}
