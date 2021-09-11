package model;
import persistence.IPrimaryKey;
import java.util.List;

public class User implements IPrimaryKey<Integer> {
    int key;
    String firstName;
    String secondName;
    int age;
    Address address;
    List<PhoneNumber> phoneNumbers;
    List<Integer> positions;

    @Override
    public Integer getKey() {
        return key;
    }

}