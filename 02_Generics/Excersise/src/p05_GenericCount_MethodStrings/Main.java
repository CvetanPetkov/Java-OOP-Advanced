package p05_GenericCount_MethodStrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.ROOT);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Double> listOfElements = new ArrayList<>();
        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            Double input = Double.valueOf(reader.readLine());
            listOfElements.add(input);
        }

        Double key = Double.valueOf(reader.readLine());
        System.out.println(countOccurancies(listOfElements, key));


    }

    private static <T extends Comparable<T>> Integer countOccurancies(List<T> list, T key) {
        Integer count = 0;
        for (T t : list) {
            if (key.compareTo(t) < 0){
                count++;
            }
        }
        return count;
    }

}
