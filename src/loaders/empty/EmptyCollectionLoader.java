package loaders.empty;

import loaders.IAttributeCollectionLoader;
import loaders.IAttributeLoader;
import model.loaders.AddressLoader;

public class EmptyCollectionLoader<T extends IAttributeLoader> implements IAttributeCollectionLoader<T> {
    @Override
    public IAttributeLoader getAttributesLoader() {
        return new EmptyAttributeLoader();
    }
}