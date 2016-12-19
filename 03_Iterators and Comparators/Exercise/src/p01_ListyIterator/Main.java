package p01_ListyIterator;

import p01_ListyIterator.interfaces.CommandDispatcher;
import p01_ListyIterator.models.CommandDispatcherImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        CommandDispatcher dispatcher = new CommandDispatcherImpl();

        while (true) {
            String[] input = reader.readLine().split("[\\s]+");

            if (input[0].equals("END")) {
                break;
            }

            try {
                dispatcher.dispatch(input);
            }
            catch (IllegalArgumentException error) {
                System.out.println(error.getMessage());
                break;
            }

        }

    }
}
