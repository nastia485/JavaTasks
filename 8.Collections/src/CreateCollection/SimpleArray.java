package CreateCollection;

import java.util.Iterator;

public class SimpleArray<E> implements Simple<E> {

    public static void main(String[] args){
        Simple<String> strings = new SimpleArray<>();
        strings.add("first");
        strings.add("second");
        strings.add("third");

        System.out.println(strings.get(1));
        System.out.println(strings.delete(2));
    }

    private E[] values;

    public SimpleArray() {
       values = (E[])new Object[0];
    }

    @Override
    public boolean add(E e) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length+1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values [values.length-1]=e;
            return true;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
            return false;
    }

    @Override
    public String delete(int index) {
        return "You can`t delete an element";
    }


    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, E e) {
    values[index] =  e;
    }

    @Override
    public Iterator iterator() {
        return new ArrayIterator<E>(values);
    }
}
