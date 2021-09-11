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
    public abstract void apply();

    //public abstract void consumer(SpecialConsumer<UserLoader<A, B, C>> consumer);
}