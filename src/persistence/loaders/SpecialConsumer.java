package persistence.loaders;

import java.util.function.Consumer;

public interface SpecialConsumer<T> extends Consumer<T> {
    @Override
    void accept(T t);
}
