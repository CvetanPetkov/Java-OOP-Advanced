package p07_FoodShortage;

import p07_FoodShortage.interfaces.Buyer;
import p07_FoodShortage.models.Citizen;
import p07_FoodShortage.models.Rebel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Buyer> list = new ArrayList<>();

        String n = reader.readLine();

        while (true) {

            String[] input = reader.readLine().split("[\\s]+");

            if (input[0].equals("End")) {
                break;
            }
            else {
                if (input.length == 3) {
                    String name = input[0];
                    String age = input[1];
                    String group = input[2];
                    Buyer rebel = new Rebel(name, age, group);
                    list.add(rebel);
                }
                else if (input.length == 4){
                    String name = input[0];
                    String age = input[1];
                    String id = input[2];
                    String birthdate = input[3];
                    Buyer citizen = new Citizen(name, age, id, birthdate);
                    list.add(citizen);
                }
                else {
                    String name = input[0];
                    tryBuyFood(list, name);
                }
            }
        }

        Integer totalFood = 0;
        for (Buyer buyer : list) {
            totalFood += buyer.getFoodBought();
        }

        System.out.println(totalFood);

    }

    private static void tryBuyFood(ArrayList<Buyer> list, String name) {
        for (Buyer buyer : list) {
            if (buyer.getName().equals(name)) {
                buyer.buyFood();
            }
        }
    }
}
