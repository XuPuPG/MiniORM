package persistence.executors;

import model.loaders.AddressLoader;
import model.loaders.HouseLoader;
import model.loaders.PhoneLoader;
import model.loaders.user.EmptyUserLoader;
import persistence.JDBIConnection;

import java.util.function.Consumer;

public class SQLEmptyHouseLoader implements Consumer<HouseLoader<EmptyUserLoader, AddressLoader, PhoneLoader>> {
    JDBIConnection JDBIConnection;
    //DI
    public SQLEmptyHouseLoader(JDBIConnection JDBIConnection){
        this.JDBIConnection = JDBIConnection;
    }
    @Override
    public void accept(HouseLoader<EmptyUserLoader, AddressLoader, PhoneLoader> loader) {
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