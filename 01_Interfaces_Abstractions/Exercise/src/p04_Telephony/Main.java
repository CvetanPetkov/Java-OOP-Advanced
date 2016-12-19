package p04_Telephony;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Smartphone smartphone = new Smartphone();

        String[] numbers = reader.readLine().split("[\\s]+");
        String[] urls = reader.readLine().split("[\\s]+");

        callNumbers(numbers, smartphone);
        browseSites(urls, smartphone);
    }

    private static void browseSites(String[] urls, Smartphone smartphone) {
        for (String url : urls) {
            try {
                System.out.println(smartphone.browse(url));
            } catch (IllegalArgumentException error) {
                System.out.println(error.getMessage());
            }
        }
    }

    private static void callNumbers(String[] numbers, Smartphone smartphone) {
        for (String number : numbers) {
            try {
                System.out.println(smartphone.call(number));
            } catch (IllegalArgumentException error){
                System.out.println(error.getMessage());
            }
        }
    }
}
