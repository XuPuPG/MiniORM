package persistence.executors;

import loaders.empty.EmptyCollectionLoader;
import loaders.empty.EmptyPrimitiveCollectionLoader;
import model.loaders.AddressLoader;
import model.loaders.PhoneLoader;
import model.loaders.UserLoader;
import persistence.JDBIConnection;

import java.util.function.Consumer;

public class SQLEmptyUserLoader implements Consumer<UserLoader<PhoneLoader, EmptyCollectionLoader<AddressLoader>, EmptyPrimitiveCollectionLoader>> {

    JDBIConnection JDBIConnection;
    //DI
    public SQLEmptyUserLoader(JDBIConnection JDBIConnection){
        this.JDBIConnection = JDBIConnection;
    }

    @Override
    public void accept(
                    UserLoader<PhoneLoader,
                    EmptyCollectionLoader<AddressLoader>,
                    EmptyPrimitiveCollectionLoader> loader) {
        /*
         * SQL
         * Загрузить сущность User:
         * Телефон {
         *   пустой
         * }
         * Адреса{
         *   пустая коллекция
         * }
         * Позиции{
         *   пустая коллекция
         * }
         *
         * */
    }
}
