package p03_GenericSwapMethodStrings;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {

    private List<T> itemsList;

    Box(){
        this.itemsList = new ArrayList<T>();
    }

    public void addItem (T item) {
        this.itemsList.add(item);
    }

    public void swapItem (Integer whatToSwap, Integer whereToSwap){
        T itemToSwap = this.itemsList.get(whatToSwap);
        T itemToRemove = this.itemsList.get(whereToSwap);

        this.itemsList.set(whatToSwap, itemToRemove);
        this.itemsList.set(whereToSwap, itemToSwap);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T t : itemsList) {
            sb.append(t.getClass().getName());
            sb.append(": ");
            sb.append(t + "\n");
        }
        return sb.toString();
    }

}
