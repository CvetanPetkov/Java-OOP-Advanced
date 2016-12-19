package p01_ListyIterator.models;

import p01_ListyIterator.interfaces.Factory;

import java.util.ArrayList;
import java.util.List;

public class FactoryImpl implements Factory{

    private List<String> list;

    public FactoryImpl() {
        this.list = new ArrayList<>();
    }

    @Override
    public List<String> getList() {
        return this.list;
    }

    @Override
    public void addElements(String[] input) {
        if (input.length > 1) {
            for (int i = 1; i < input.length; i++) {
                this.list.add(input[i]);
            }
        }
        else {
            throw new IllegalArgumentException("Invalid Operation!");
        }
    }

}
