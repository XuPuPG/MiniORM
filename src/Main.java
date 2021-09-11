import loaders.empty.EmptyCollectionLoader;
import loaders.empty.EmptyPrimitiveCollectionLoader;
import model.loaders.AddressLoader;
import model.loaders.HouseLoader;
import model.loaders.PhoneLoader;
import model.loaders.UserLoader;
import model.loaders.user.EmptyUserLoader;
import persistence.JDBIConnection;
import persistence.executors.SQLEmptyHouseLoader;
import persistence.executors.SQLEmptyUserLoader;
import persistence.executors.SQLHouseWithUserLoader;


public class Main {

    public static void main(String[] args) {
        //в основном, generic тип для
        //классов загрузчиков нужен был для вывода типа из переданных
        //аргументов в конструктор, для удобного создания экземпляра через Ctrl+Alt+V

        JDBIConnection JDBIConnection = new JDBIConnection();

        UserLoader<PhoneLoader, EmptyCollectionLoader<AddressLoader>, EmptyPrimitiveCollectionLoader> userLoader = new UserLoader<>(
                new PhoneLoader(),
                new EmptyCollectionLoader<>(),
                new EmptyPrimitiveCollectionLoader() {}
        );

        HouseLoader<
                EmptyUserLoader,
                AddressLoader,
                PhoneLoader> emptyUserHouseLoader = new HouseLoader<>
                (
                        new EmptyUserLoader(),
                        new PhoneLoader(),
                        new AddressLoader()
                );

        HouseLoader<UserLoader<PhoneLoader, EmptyCollectionLoader<AddressLoader>, EmptyPrimitiveCollectionLoader>, AddressLoader, PhoneLoader> houseLoader
                = new HouseLoader<>
                (
                        userLoader, //для большей динамичности
                        new PhoneLoader(),
                        new AddressLoader()
                );

        //из за стирания типов в джаве не получилось перенести все методы для работы с запросом в один класс
        //выполняют запрос в базу
        SQLHouseWithUserLoader houseWithUser = new SQLHouseWithUserLoader();
        SQLEmptyUserLoader sqlEmptyUserLoader = new SQLEmptyUserLoader(JDBIConnection);
        SQLEmptyHouseLoader sqlEmptyHouseLoader = new SQLEmptyHouseLoader(JDBIConnection);

        //выполнить запрос (позже можно вернуть вернуть модель пока void)
        houseWithUser.accept(houseLoader);
        sqlEmptyUserLoader.accept(userLoader);
        sqlEmptyHouseLoader.accept(emptyUserHouseLoader);

    }
}
