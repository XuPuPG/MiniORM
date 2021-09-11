package model.loaders;

import loaders.IAttributeLoader;
import loaders.empty.EmptyAttributeLoader;
import model.Address;

import java.util.function.Consumer;


public class HouseLoader<A extends IAttributeLoader, B extends AddressLoader, C extends PhoneLoader> implements IAttributeLoader {
    A userLoader;
    C phoneNumberLoader;
    B addressLoader;

    public HouseLoader(A userLoader,
                       C phoneNumberLoader,
                       B addressLoader) {
        this.userLoader = userLoader;
        this.phoneNumberLoader = phoneNumberLoader;
        this.addressLoader = addressLoader;
    }

    public static class PersistenceExecutor<A,B,C>{}
    /*public void accept(Consumer<HouseLoader.PersistenceExecutor<A, B, C>> consumer){
        consumer.accept(new HouseLoader.PersistenceExecutor<>());
    }*/

    public void accept(Consumer<HouseLoader<A, B, C>> consumer){ }


    @Override
    public IAttributeLoader getAttributesLoader() {
        return new EmptyAttributeLoader();
    }
}
