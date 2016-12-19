package p03_StackIterator;

import p03_StackIterator.interfaces.Stack;
import p03_StackIterator.models.StackImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Stack stack = new StackImpl();

        while (true) {

            String[] input = reader.readLine().split(" ");
            if (input[0].equals("END")) {
                for (int i = 0; i < 2; i++) {
                    stack.forEach(System.out::println);
                }
                break;
            }

            switch (input[0]) {
                case "Push":
                    for (int i = 1; i < input.length; i++) {
                        Integer n = Integer.valueOf(String.valueOf(input[i].charAt(0)));
                        stack.push(n);
                    }
                    break;
                case "Pop":
                    try {
                        stack.pop();
                    }
                    catch (IllegalArgumentException error) {
                        System.out.println(error.getMessage());
                    }
                    break;
            }
        }

    }
}
