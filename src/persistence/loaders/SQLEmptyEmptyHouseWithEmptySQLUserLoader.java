package persistence.loaders;

import model.loaders.EmptyAddressLoader;
import model.loaders.EmptyHouseLoader;
import model.loaders.EmptyPhoneLoader;

public class SQLEmptyEmptyHouseWithEmptySQLUserLoader extends EmptyHouseLoader<
        SQLEmptyUserLoader,
        EmptyAddressLoader,
        EmptyPhoneLoader> {

    @Override
    public void apply() {
        //SQLEmptyUserLoader может использоваться для получения данных по нужному алгоритму
        SQLEmptyUserLoader emptyUserLoader = new SQLEmptyUserLoader();


        /*
         * SQL
         * Загрузить сущность House:
         * Пользователь = SQLEmptyUserLoader{
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
