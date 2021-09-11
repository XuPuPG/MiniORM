package model;

import persistence.IPrimaryKey;

public class House implements IPrimaryKey<Integer> {
    int key;
    User user;
    Address address;
    PhoneNumber phoneNumber;

    @Override
    public Integer getKey() {
        return key;
    }
}
