package model;

import persistence.IPrimaryKey;

public class PhoneNumber implements IPrimaryKey<Integer> {
    int key;
    String countryIndex;
    String number;

    @Override
    public Integer getKey() {
        return key;
    }
}