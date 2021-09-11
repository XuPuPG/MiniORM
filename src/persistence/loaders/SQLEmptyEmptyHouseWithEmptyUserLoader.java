package persistence.loaders;

import model.loaders.EmptyAddressLoader;
import model.loaders.EmptyHouseLoader;
import model.loaders.EmptyPhoneLoader;
import model.loaders.EmptyUserLoader;

public class SQLEmptyEmptyHouseWithEmptyUserLoader extends EmptyHouseLoader<
        EmptyUserLoader,
        EmptyAddressLoader,
        EmptyPhoneLoader> {

    @Override
    public void apply() {
        /*
         * SQL
         * Загрузить сущность House:
         * Пользователь = EmptyUserLoader{
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
