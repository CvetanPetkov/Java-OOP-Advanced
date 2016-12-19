package p05_BorderControl;

import p05_BorderControl.interfaces.Fakeable;
import p05_BorderControl.models.Citizen;
import p05_BorderControl.models.Robot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Fakeable> list = new ArrayList<>();

        while (true) {

            String[] input = reader.readLine().split("[\\s]+");

            if (input[0].equals("End")) {
                break;
            }
            else {
                if (input.length < 3) {
                    String model = input[0];
                    String id = input[1];
                    Fakeable robot = new Robot(model, id);
                    list.add(robot);
                }
                else {
                    String name = input[0];
                    String age = input[1];
                    String id = input[2];
                    Fakeable citizen = new Citizen(name, age, id);
                    list.add(citizen);
                }
            }

        }

        String code = reader.readLine();

        for (Fakeable fakeable : list) {
            fakeable.isFake(code);
        }
    }
}
