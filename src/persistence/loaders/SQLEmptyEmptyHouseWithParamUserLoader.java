package persistence.loaders;

import loaders.empty.EmptyEntityCollectionLoader;
import loaders.empty.EmptyPrimitiveCollectionLoader;
import model.loaders.EmptyAddressLoader;
import model.loaders.EmptyHouseLoader;
import model.loaders.EmptyPhoneLoader;
import model.loaders.UserLoader;

public class SQLEmptyEmptyHouseWithParamUserLoader extends EmptyHouseLoader<UserLoader<EmptyPhoneLoader, EmptyEntityCollectionLoader<EmptyAddressLoader>, EmptyPrimitiveCollectionLoader>, EmptyAddressLoader, EmptyPhoneLoader> {
    @Override
    public void apply() {
        /*
         * SQL
         * Загрузить сущность House:
         * Пользователь{
         *   Телефон{
         *       пустая коллекция
         *   }
         *   Адреса{
         *       пустая коллекция
         *   }
         *   Позиции(название поля см. в конструкторе){
         *       пустая коллекция
         *   }
         * }
         * Адресс{
         *   пустой
         * }
         * Телефон{
         *   пустой
         * }
         * */
    }
}
