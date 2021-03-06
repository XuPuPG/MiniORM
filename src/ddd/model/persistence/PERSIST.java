package ddd.model.persistence;

//состояния сущности
public enum PERSIST {
    TRANSIENT,      //переходное состояние, сущность которой никогда в базе, созданная через new
    PERSISTENCE,    //сущность получает обновления в базу сразу же
    DETACHED,       //была отсоединена и локальные изменения не поступают в базу автоматически
    REMOVED;        //сущность удалена
}