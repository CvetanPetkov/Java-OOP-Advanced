package p04_Froggy.models;

import java.util.Iterator;
import java.util.function.Consumer;

public class LakeImpl implements Iterable<Integer> {

    private Integer[] collection;

    public LakeImpl(Integer[] integers) {
        this.setCollection(integers);
    }

    public void setCollection(Integer[] collection) {
        this.collection = collection;
    }

    @Override
    public Iterator<Integer> iterator() {
        Frog frog = new Frog();
        return frog;
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {
        for (int i = 0; i < this.collection.length; i++) {
            action.accept(this.collection[i]);
            i++;
        }
    }

    // Create nested class

    private class Frog implements Iterator<Integer> {

        private int evenIndex;
        private int oddIndex;

        public Frog() {
            this.evenIndex = -2;
            this.oddIndex = -1;
        }

        @Override
        public boolean hasNext() {
            return evenIndex < collection.length - 2 ||
                    oddIndex < collection.length -2;
        }

        @Override
        public Integer next() {
            if (evenIndex + 2 >= collection.length) {
                return collection[oddIndex+=2];
            }
            return collection[evenIndex+=2];
        }
    }
}
