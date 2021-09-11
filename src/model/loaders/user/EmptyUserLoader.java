package model.loaders.user;

import loaders.IAttributeLoader;
import loaders.empty.EmptyAttributeLoader;

public class EmptyUserLoader implements IAttributeLoader {
    @Override
    public IAttributeLoader getAttributesLoader() {
        return new EmptyAttributeLoader();
    }
}
