package p01_ListyIterator.models;

import p01_ListyIterator.interfaces.ListIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListyIteratorImpl implements ListIterator, Iterable<String> {

    private List<String> collection;
    private int currIndex;

    public ListyIteratorImpl() {
        this.setCollection(new ArrayList<String>());
        this.currIndex = 0;
    }

    public ListyIteratorImpl(List<String> collection) {
        this.setCollection(collection);
    }

    private void setCollection(List<String> collection) {
        this.collection = collection;
    }

    @Override
    public boolean move() {
        if (this.hasNext()) {
            this.currIndex++;
            return true;
        }
        return false;
    }

    @Override
    public boolean hasNext() {
        return this.currIndex < this.collection.size() -1;
    }

    @Override
    public void print() {
        System.out.println(this.collection.get(currIndex));
    }

    @Override
    public void printAll() {
        for (String s : collection) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {

            private int currIndex = 0;

            @Override
            public boolean hasNext() {
                return this.currIndex < ListyIteratorImpl.this.collection.size() -1;
            }

            @Override
            public String next() {
                return ListyIteratorImpl.this.collection.get(currIndex++);
            }
        };
    }
}
