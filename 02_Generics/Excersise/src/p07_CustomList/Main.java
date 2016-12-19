package p07_CustomList;

import p07_CustomList.interfaces.Functions;
import p07_CustomList.models.CommandInterpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Functions customList = new CommandInterpreter();

        while (true) {
            String[] input = reader.readLine().split("[\\s]+");
            if (input[0].equals("END")) {
                break;
            }

            switch (input[0]) {
                case "Add": customList.addElement(input[1]); break;
                case "Remove": customList.removeElement(Integer.valueOf(input[1])); break;
                case "Contains": System.out.println(customList.containsElement(input[1])); break;
                case "Swap": customList.swapElement(Integer.valueOf(input[1]), Integer.valueOf(input[2])); break;
                case "Greater": System.out.println(customList.countGreater(input[1])); break;
                case "Max": System.out.println(customList.getMax()); break;
                case "Min": System.out.println(customList.getMin()); break;
                case "Print": System.out.print(customList.printElements()); break;
                case "Sort": customList.sort(); break;
            }

        }

    }
}
