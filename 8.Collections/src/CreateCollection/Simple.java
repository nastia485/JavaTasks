package CreateCollection;

public interface Simple<E> extends Iterable<E>{

    boolean add(E e);
    String delete(int index);
    E get(int index);
    int size();
    void update(int index, E e);
}
