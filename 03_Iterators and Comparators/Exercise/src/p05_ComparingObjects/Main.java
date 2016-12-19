package p05_ComparingObjects;

import p05_ComparingObjects.models.PersonImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<PersonImpl> personList = new ArrayList<>();
        int countEquals = 0;
        int countDifferents = 0;
        int countAll = 0;

        while (true) {
            String[] input = reader.readLine().split("[\\s]+");
            if (input[0].equals("END")) {
                break;
            }

            String name = input[0];
            int age = Integer.valueOf(input[1]);
            String town = input[2];
            PersonImpl person = new PersonImpl(name, age, town);
            personList.add(person);
        }

        int n = Integer.valueOf(reader.readLine());
        if (n >= personList.size()) {
            System.out.println("No matches");
        } else {
            for (PersonImpl person : personList) {
                if (personList.get(n).compareTo(person) > 0) {
                    countEquals++;
                } else {
                    countDifferents++;
                }
            }
            countAll = personList.size();

            System.out.printf("%s %s %s",
                    countEquals, countDifferents, countAll);
        }

    }
}
