package persistence.loaders;

import loaders.empty.EmptyEntityCollectionLoader;
import loaders.empty.EmptyPrimitiveCollectionLoader;
import model.loaders.EmptyAddressLoader;
import model.loaders.EmptyPhoneLoader;
import model.loaders.UserLoader;

public class SQLEmptyUserLoader extends UserLoader<EmptyPhoneLoader, EmptyEntityCollectionLoader<EmptyAddressLoader>, EmptyPrimitiveCollectionLoader> {


    @Override
    public void apply() {
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
