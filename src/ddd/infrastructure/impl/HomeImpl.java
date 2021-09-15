package ddd.infrastructure.impl;

import ddd.model.entity.IHome;
import ddd.model.common.StandardEntityImpl;

public abstract class HomeImpl extends StandardEntityImpl<Integer> implements IHome {
    protected int number;
    protected String filed;

    public int getNumber() {
        return number;
    }

    @Override
    public String getFiled() {
        return filed;
    }

    @Override
    public void setFiled(String filed) {
        this.filed = filed;
    }

    @Override
    public void setNumber(int number) {
        // бизнес логика
        if(number > 10) throw new IllegalArgumentException();
        this.number = number;
    }

}