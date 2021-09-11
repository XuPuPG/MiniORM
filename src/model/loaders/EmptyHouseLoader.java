package model.loaders;


import loaders.empty.EmptyAttributeLoader;


public abstract class EmptyHouseLoader<A extends EmptyAttributeLoader, B extends EmptyAddressLoader, C extends EmptyPhoneLoader> extends EmptyAttributeLoader {
/*    A userLoader;
    C phoneNumberLoader;
    B addressLoader;

    public HouseLoader(A userLoader,
                       C phoneNumberLoader,
                       B addressLoader) {
        this.userLoader = userLoader;
        this.phoneNumberLoader = phoneNumberLoader;
        this.addressLoader = addressLoader;
    }*/


    public abstract void apply();

    //public abstract void consumer(SpecialConsumer<HouseLoader<A, B, C>> consumer);
}
