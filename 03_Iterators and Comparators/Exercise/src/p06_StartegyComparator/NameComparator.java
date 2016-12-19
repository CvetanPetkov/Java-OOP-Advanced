package p06_StartegyComparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int lengthCompare = Integer.compare(
                o1.getName().length(),
                o2.getName().length());
        if (lengthCompare == 0) {
            return Character.compare(
                    o1.getName().toLowerCase().charAt(0),
                    o2.getName().toLowerCase().charAt(0));
        }
        return lengthCompare;
    }
}
