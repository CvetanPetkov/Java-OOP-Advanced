package p02_KingsGambit;

import p02_KingsGambit.contracts.King;
import p02_KingsGambit.contracts.Unit;
import p02_KingsGambit.models.Footman;
import p02_KingsGambit.models.KingImpl;
import p02_KingsGambit.models.RoyalGuard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split("[\\s]+");
        King king = new KingImpl(input[0]);

        input = reader.readLine().split("[\\s]+");
        for (String s : input) {
            Unit unit = new RoyalGuard(s);
            king.addUnit(unit);
        }

        input = reader.readLine().split("[\\s]+");
        for (String s : input) {
            Unit unit = new Footman(s);
            king.addUnit(unit);
        }

        while (true) {

            input = reader.readLine().split("[\\s]+");

            if (input[0].equals("End")) {
                break;
            }

            switch (input[0]) {
                case "Attack":
                    king.attackKing();
                    break;
                case "Kill":
                    king.killUnit(input[1]);
                    break;
            }

        }
    }
}
