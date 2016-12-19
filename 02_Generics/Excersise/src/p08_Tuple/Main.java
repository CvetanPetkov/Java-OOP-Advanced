package p08_Tuple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Tuple> list = new ArrayList<>();

        String[] input = reader.readLine().split("[\\s]+");
        Tuple tuple = new TupleImpl((input[0] + " " + input[1]),
                input[2], input[3]);
        list.add(tuple);

        input = reader.readLine().split(" ");
        boolean isDrunk = false;
        if (input[2].equals("drunk")) {
            isDrunk = true;
        }
        tuple = new TupleImpl(input[0], Integer.valueOf(input[1]), isDrunk);
        list.add(tuple);

        input = reader.readLine().split(" ");
        tuple = new TupleImpl(input[0], Double.valueOf(input[1]), input[2]);
        list.add(tuple);

        for (Tuple tuple1 : list) {
            System.out.println(tuple1.toString());
        }

    }
}
