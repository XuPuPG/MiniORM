import loaders.empty.EmptyEntityCollectionLoader;
import loaders.empty.EmptyPrimitiveCollectionLoader;
import model.loaders.EmptyAddressLoader;
import model.loaders.EmptyHouseLoader;
import model.loaders.EmptyPhoneLoader;
import model.loaders.UserLoader;
import model.loaders.user.EmptyUserLoader;
import persistence.JDBIConnection;
import persistence.loaders.*;


public class Main {
    public static JDBIConnection jDBIConnection = new JDBIConnection();

    public static void main(String[] args) {
        //в основном, generic тип для
        //классов загрузчиков нужен был для вывода типа из переданных
        //аргументов в конструктор, для удобного создания экземпляра через Ctrl+Alt+V

        UserLoader<EmptyPhoneLoader,
                EmptyEntityCollectionLoader<EmptyAddressLoader>,
                EmptyPrimitiveCollectionLoader> userLoader = new SQLEmptyUserLoader();

        EmptyHouseLoader<
                        EmptyUserLoader,
                        EmptyAddressLoader,
                        EmptyPhoneLoader> emptyUserEmptyHouseLoader = new SQLEmptyEmptyHouseWithEmptyUserLoader();

        EmptyHouseLoader<
                        SQLEmptyUserLoader,
                        EmptyAddressLoader,
                        EmptyPhoneLoader> emptySQLUserEmptyHouseLoader = new SQLEmptyEmptyHouseWithEmptySQLUserLoader();

        EmptyHouseLoader<UserLoader<
                        EmptyPhoneLoader,
                EmptyEntityCollectionLoader<EmptyAddressLoader>,
                        EmptyPrimitiveCollectionLoader>,
                        EmptyAddressLoader,
                        EmptyPhoneLoader> emptyHouseLoader = new SQLEmptyEmptyHouseWithParamUserLoader();
    }

}
