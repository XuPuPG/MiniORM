package loaders.empty;

import loaders.IAttributeLoader;

public class EmptyAttributeLoader implements IAttributeLoader {
    @Override
    public IAttributeLoader getAttributesLoader() {
        return null;
    }
}