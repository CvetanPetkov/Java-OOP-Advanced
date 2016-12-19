package p04_Froggy;

import p04_Froggy.models.LakeImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split("[,\\s]+");
        Integer[] integers = new Integer[input.length];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = Integer.valueOf(input[i]);
        }

        LakeImpl lake = new LakeImpl(integers);

        input = reader.readLine().split(" ");

        StringBuilder output = new StringBuilder();

        for (int number : lake) {
            output.append(number);
            output.append(", ");
        }

        System.out.println(output.toString().substring(0, output.length() - 2));

    }
}
