package p06_BirthdayCelebrations;

import p06_BirthdayCelebrations.interfaces.IBirthdate;
import p06_BirthdayCelebrations.models.Citizen;
import p06_BirthdayCelebrations.models.Pet;
import p06_BirthdayCelebrations.models.Robot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<IBirthdate> list = new ArrayList<>();

        while (true) {

            String[] input = reader.readLine().split("[\\s]+");

            if (input[0].equals("End")) {
                break;
            }
            else {
                if (input[0].equals("Robot")) {
                    String model = input[1];
                    String id = input[2];
                    Robot robot = new Robot(model, id);
                }
                else if (input[0].equals("Citizen")){
                    String name = input[1];
                    String age = input[2];
                    String id = input[3];
                    String birthdate = input[4];
                    IBirthdate citizen = new Citizen(name, age, id, birthdate);
                    list.add(citizen);
                }
                else if (input[0].equals("Pet")) {
                    String name = input[1];
                    String birthdate = input[2];
                    IBirthdate pet = new Pet(name, birthdate);
                    list.add(pet);
                }
            }

        }

        String year = reader.readLine();
        for (IBirthdate iBirthdate : list) {
            iBirthdate.iBirthdate(year);
        }

    }
}
