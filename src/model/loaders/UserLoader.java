package model.loaders;

import loaders.IAttributeCollectionLoader;
import loaders.IAttributeLoader;
import loaders.IPrimitiveCollectionLoader;
import loaders.empty.EmptyAttributeLoader;
import loaders.empty.EmptyCollectionLoader;
import loaders.empty.EmptyPrimitiveCollectionLoader;
import model.loaders.user.EmptyUserLoader;

import java.util.function.Consumer;

public class UserLoader<
        A extends PhoneLoader,
        B extends IAttributeCollectionLoader<AddressLoader>,
        C extends IPrimitiveCollectionLoader>
        implements IAttributeLoader
{
    A phoneNumberLoader;
    B addressCollectionLoader;
    C positionsLoader;

    public UserLoader(A phoneNumberLoader,
                      B addressCollectionLoader,
                      C positionsLoader) {
        this.phoneNumberLoader = phoneNumberLoader;
        this.addressCollectionLoader = addressCollectionLoader;
        this.positionsLoader = positionsLoader;
    }

    @Override
    public EmptyAttributeLoader getAttributesLoader() {
        return new EmptyAttributeLoader();
    }
}