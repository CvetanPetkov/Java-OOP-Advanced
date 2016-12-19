package p01_ListyIterator.interfaces;

import java.util.List;

public interface Factory {

    List<String> getList();

    void addElements(String[] input);
}
