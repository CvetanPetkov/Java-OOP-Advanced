package P03_DependencyInversionSkeleton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrimitiveCalculator calculator = new PrimitiveCalculator();

        while (true) {

            String[] input = reader.readLine().split("[\\s]+");

            if (input[0].equals("End")) { break; }

            switch (input[0]) {
                case "mode":
                    Character sign = input[1].charAt(0);
                    calculator.changeStrategy(sign);
                    break;
                default:
                    int firstOperand = Integer.valueOf(input[0]);
                    int secondOperand = Integer.valueOf(input[1]);
                    System.out.println(
                            calculator.performCalculation(firstOperand, secondOperand));
                    break;
            }

        }
    }
}
