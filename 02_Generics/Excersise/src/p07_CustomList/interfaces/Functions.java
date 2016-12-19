package p07_CustomList.interfaces;

public interface Functions<T> extends
                        Addable<T>, Contains<T>, CountGreater<T>,
                        GetMax<T>, GetMin<T>, Removeable<T>,
                        Swapable<T>, Printable<T>, Sortable<T>{

    @Override
    T getMax();

    @Override
    T getMin();

    @Override
    void addElement(T element);

    @Override
    void swapElement(int index1, int index2);

    @Override
    void removeElement(int index);

    @Override
    boolean containsElement(T element);

    @Override
     Integer countGreater(T element);

    @Override
    String printElements();

    @Override
    void sort();
}
