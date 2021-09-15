package ddd.model.common;



public abstract class StandardEntityImpl<T> implements IStandardEntity<T> {
    T id;
    public T getId() { return id;}
}