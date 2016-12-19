package p07_CustomList.models;

import p07_CustomList.interfaces.Functions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CommandInterpreter<T extends Comparable<T>> implements Functions<T>, Iterable<T>{

    private List<T> list;

    public CommandInterpreter() {
        this.list = new ArrayList<>();
    }

    @Override
    public T getMax() {
        T max = this.list.get(0);
        for (T t : list) {
            if (t.compareTo(max) > 0) {
                max = t;
            }
        }
        return max;
    }

    @Override
    public T getMin() {
        T min = this.list.get(0);
        for (T t : list) {
            if (t.compareTo(min) < 0) {
                min = t;
            }
        }
        return min;
    }

    @Override
    public void addElement(T element) {
        this.list.add(element);
    }

    @Override
    public void swapElement(int index1, int index2) {
        T itemToSwap1 = this.list.get(index1);
        T itemToSwap2 = this.list.get(index2);
        this.list.set(index1, itemToSwap2);
        this.list.set(index2, itemToSwap1);
    }

    @Override
    public void removeElement(int index) {
        this.list.remove(index);
    }

    @Override
    public boolean containsElement(T element) {
        return this.list.contains(element);
    }

    @Override
    public Integer countGreater(T element) {
        Integer count = 0;
        for (T t : this.list) {
            if (t.compareTo(element) > 0){
                count++;
            }
        }
        return count;
    }

    @Override
    public String printElements() {
        StringBuilder sb = new StringBuilder();
        for (T t : list) {
            sb.append(t + "\n");
        }

        return sb.toString();
    }

    @Override
    public void sort() {
        Collections.sort(this.list);
    }
}
