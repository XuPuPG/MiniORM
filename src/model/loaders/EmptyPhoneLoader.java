package model.loaders;

import loaders.IAttributeLoader;
import loaders.empty.EmptyAttributeLoader;
import persistence.loaders.SpecialConsumer;

public abstract class EmptyPhoneLoader extends EmptyAttributeLoader {

    public abstract void apply();

    //public abstract void consumer(SpecialConsumer<PhoneLoader> consumer);
}