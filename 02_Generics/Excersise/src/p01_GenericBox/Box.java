package p01_GenericBox;

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
