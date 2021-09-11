package persistence.executors;

import loaders.empty.EmptyCollectionLoader;
import loaders.empty.EmptyPrimitiveCollectionLoader;
import model.loaders.AddressLoader;
import model.loaders.HouseLoader;
import model.loaders.PhoneLoader;
import model.loaders.UserLoader;

import java.util.function.Consumer;

public class SQLHouseWithUserLoader implements Consumer<HouseLoader<UserLoader<PhoneLoader, EmptyCollectionLoader<AddressLoader>, EmptyPrimitiveCollectionLoader>, AddressLoader, PhoneLoader>> {

    @Override
    public void accept(
            HouseLoader<
                    UserLoader<
                            PhoneLoader,
                            EmptyCollectionLoader<AddressLoader>,
                            EmptyPrimitiveCollectionLoader>,
                    AddressLoader,
                    PhoneLoader> loader) {
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
