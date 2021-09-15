package ddd.model.entity;

import ddd.model.common.PersistenceEntity;

//интерфейс модели
public interface IHome extends PersistenceEntity {
    int getNumber();
    void setNumber(int n);
    void setFiled(String filed);
    String getFiled();
}