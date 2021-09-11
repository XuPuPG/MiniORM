package model.loaders;

import loaders.empty.EmptyAttributeLoader;
import loaders.empty.EmptyEntityCollectionLoader;
import loaders.empty.EmptyPrimitiveCollectionLoader;

public abstract class UserLoader<
        A extends EmptyPhoneLoader,
        B extends EmptyEntityCollectionLoader<EmptyAddressLoader>,
        C extends EmptyPrimitiveCollectionLoader>
        extends EmptyAttributeLoader
{
/*    A phoneNumberLoader;
    B addressCollectionLoader;
    C positionsLoader;

    public UserLoader(){}
    public UserLoader(A phoneNumberLoader,
                      B addressCollectionLoader,
                      C positionsLoader) {
        this.phoneNumberLoader = phoneNumberLoader;
        this.addressCollectionLoader = addressCollectionLoader;
        this.positionsLoader = positionsLoader;
    }*/


    public abstract void apply();

    //public abstract void consumer(SpecialConsumer<UserLoader<A, B, C>> consumer);
}