package ddd;

import ddd.application.CompositionRoot;
import ddd.model.common.IPersistenceStrategy;
import ddd.domain.repository.IHomeRepository;
import ddd.model.entity.IHome;
import ddd.model.persistence.OPERATION;

public class Demo {

    public static void main(String[] args) {

        CompositionRoot compositionRoot = new CompositionRoot();

        IHome home = compositionRoot.getEntityFactory().createHome();
        IHome home2 = compositionRoot.getEntityFactory().createHome();

        IHomeRepository<IHome> homeRepository = compositionRoot.getRepositoryFactory().getHomeRepository();

        //стратегия операций над сущностью, загрузка, слияние, обновление, добавление
        //стратегию всегда можно поменять или написать новую для более направленного получения данных из базы
        home.setPersistenceStrategy(compositionRoot.getPersistenceStrategyFactory().getDefaultHomePersistenceStrategy());
        home2.setPersistenceStrategy(compositionRoot.getPersistenceStrategyFactory().getDefaultHomePersistenceStrategy());

        home.getPersistenceStrategy().prepareEntity(home, OPERATION.REFRESH);
        home2.getPersistenceStrategy().prepareEntity(home2, OPERATION.PERSIST);

        System.out.println(home.getPersistenceStrategy());
        System.out.println(home2.getPersistenceStrategy());

        System.out.println(home.getPersistenceStrategy());
        System.out.println(home2.getPersistenceStrategy());


        System.out.println(home.getFiled());

        //добавление в базу только что полученной сущности
        homeRepository.explain(home.getPersistenceStrategy());

        System.out.println(home.getFiled());



        //меняем
        home.setNumber(4);

        //обновление сущности в базе
        home.getPersistenceStrategy().prepareTo(OPERATION.MERGE);
        homeRepository.explain(home.getPersistenceStrategy());

    }
}
