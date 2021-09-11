package model.loaders;

import loaders.IAttributeLoader;
import loaders.empty.EmptyAttributeLoader;

public class PhoneLoader implements IAttributeLoader {
    @Override
    public IAttributeLoader getAttributesLoader() {
        return new EmptyAttributeLoader();
    }
}