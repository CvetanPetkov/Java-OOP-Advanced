package p03_GenericSwapMethodStrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        Box box = new Box();

        for (int i = 0; i < n; i++) {
            int input = Integer.valueOf(reader.readLine());
            box.addItem(input);
        }

        String[] input = reader.readLine().split(" ");
        int a = Integer.valueOf(input[0]);
        int b = Integer.valueOf(input[1]);
        box.swapItem(a, b);
        System.out.println(box.toString());

    }
}
