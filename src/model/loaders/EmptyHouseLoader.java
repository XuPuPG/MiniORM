package model.loaders;


import loaders.empty.EmptyAttributeLoader;


public abstract class EmptyHouseLoader<A extends EmptyAttributeLoader, B extends EmptyAddressLoader, C extends EmptyPhoneLoader> extends EmptyAttributeLoader {
    public abstract void apply();

    //public abstract void consumer(SpecialConsumer<HouseLoader<A, B, C>> consumer);
}
