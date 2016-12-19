package p03_StackIterator.models;

import p03_StackIterator.interfaces.Stack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class StackImpl implements Stack, Iterable<Integer> {

    private int currIndex;
    private List<Integer> list;

    public StackImpl() {
        this.currIndex = 0;
        this.list = new ArrayList<>();
    }

    private void setCurrIndex() {
        this.currIndex = this.list.size() - 1;
    }

    @Override
    public void push(Integer i) {
        this.list.add(0, i);
        this.setCurrIndex();
    }

    @Override
    public void pop() {
        if (this.list.size() > 0) {
            this.list.remove(0);
        }
        else {
            throw new IllegalArgumentException("No elements");
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {

            @Override
            public boolean hasNext() {
                return StackImpl.this.list.size() > 0;
            }

            @Override
            public Integer next() {
                if (hasNext()) {
                    return StackImpl.this.list.get(0);
                } else {
                    throw new IllegalArgumentException("No elements");
                }
            }
        };
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
