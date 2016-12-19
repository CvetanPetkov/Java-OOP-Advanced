package p01_ListyIterator.models;

import p01_ListyIterator.interfaces.CommandDispatcher;
import p01_ListyIterator.interfaces.Factory;
import p01_ListyIterator.interfaces.ListIterator;

import java.util.ArrayList;
import java.util.List;

public class CommandDispatcherImpl implements CommandDispatcher{

    private List<String> list;
    private ListIterator listyIterator;

    public CommandDispatcherImpl() {
        this.list = new ArrayList<>();
        this.listyIterator = new ListyIteratorImpl();
    }

    private void setList(List<String> list) {
        this.list = list;
    }

    private void setListyIterator(List<String> list) {
        this.listyIterator = new ListyIteratorImpl(list);
    }

    @Override
    public void dispatch(String[] input) {
        switch (input[0]) {
            case "Create":
                Factory factory = new FactoryImpl();
                factory.addElements(input);
                setList(factory.getList());
                setListyIterator(this.list);
                break;
            case "Move":
                System.out.println(listyIterator.move());
                break;
            case "Print":
                listyIterator.print();
                break;
            case "HasNext":
                System.out.println(listyIterator.hasNext());
                break;
            case "PrintAll":
                listyIterator.printAll();
                break;
        }
    }
}
