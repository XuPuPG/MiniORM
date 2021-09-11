package model.loaders;


import loaders.empty.EmptyAttributeLoader;
import model.Address;
import persistence.loaders.SpecialConsumer;

public abstract class EmptyAddressLoader extends EmptyAttributeLoader {

    public abstract void apply();

    //public abstract void consumer(SpecialConsumer<AddressLoader> consumer);
}