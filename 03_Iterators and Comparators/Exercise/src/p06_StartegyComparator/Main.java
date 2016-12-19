package p06_StartegyComparator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<Person> nameSet = new TreeSet<>(new NameComparator());
        Set<Person> ageSet = new TreeSet<>(new AgeComparator());

        int n = Integer.valueOf(reader.readLine());
        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split("[\\s]+");
            String name = input[0];
            int age = Integer.valueOf(input[1]);

            Person person = new Person(name, age);
            nameSet.add(person);
            ageSet.add(person);
        }

        for (Person person : nameSet) {
            System.out.println(person.toString());
        }
        for (Person person : ageSet) {
            System.out.println(person.toString());
        }

    }
}
