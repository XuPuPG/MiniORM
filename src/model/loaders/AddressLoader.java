package model.loaders;

import loaders.IAttributeLoader;
import loaders.empty.EmptyAttributeLoader;

public class AddressLoader implements IAttributeLoader {
    @Override
    public IAttributeLoader getAttributesLoader() {
        return new EmptyAttributeLoader();
    }
}