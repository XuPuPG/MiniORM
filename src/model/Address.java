package model;

import persistence.IPrimaryKey;

import java.util.Collections;

public class Address implements IPrimaryKey<Integer> {
    int key;

    String street;
    String HouseNumber;

    @Override
    public Integer getKey() {
    return key;
    }
}