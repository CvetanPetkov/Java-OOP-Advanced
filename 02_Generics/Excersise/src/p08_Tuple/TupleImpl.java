package p08_Tuple;

public class TupleImpl<T> implements Tuple {

    private T item1;
    private T item2;
    private T item3;

    public TupleImpl(T item1, T item2, T item3) {
        this.setItem1(item1);
        this.setItem2(item2);
        this.setItem3(item3);
    }

    private void setItem1(T item1) {
        this.item1 = item1;
    }

    private void setItem2(T item2) {
        this.item2 = item2;
    }

    private void setItem3(T item3) {
        this.item3 = item3;
    }

    @Override
    public T getFirst() {
        return this.item1;
    }

    @Override
    public T getSecond() {
        return this.item2;
    }

    @Override
    public T getThird() {
        return this.item3;
    }

    @Override
    public String toString() {
        return String.format("%s -> %s -> %s",
                this.getFirst(), this.getSecond(), this.getThird());
    }

}
