package p08_MilitaryElite;

import p08_MilitaryElite.interfaces.*;
import p08_MilitaryElite.models.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.ROOT);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<IPrivate> privatesList = new ArrayList<>();


        while (true) {

            String[] input = reader.readLine().split("[\\s]+");
            if (input[0].equals("End")) {
                break;
            }

            switch (input[0]){
                case "Private": makePrivate(input, privatesList); break;
                case "LeutenantGeneral": makeLeutenantGeneral(input, privatesList); break;
                case "Engineer": makeEngineer(input); break;
                case "Commando": makeCommando(input); break;
                case "Spy": makeSpy(input); break;
            }

        }

    }

    private static void makeSpy(String[] input) {
        String id = input[1];
        String firstName = input[2];
        String lastName = input[3];
        String codeNumber = input[4];
        ISpy spy = new Spy(id, firstName, lastName, codeNumber);

        System.out.println(spy.toString());
    }

    private static void makeCommando(String[] input) {
        String id = input[1];
        String firstName = input[2];
        String lastName = input[3];
        Double salary = Double.valueOf(input[4]);
        String corps = input[5];
        if (corps.equals("Airforces") || corps.equals("Marines")) {
            ICommando commando = new Commando(id, firstName, lastName, salary, corps);
            int iterator = (input.length - 6) / 2;
            for (int i = 0; i < iterator; i++) {
                String missionName = input[6 + i * 2];
                String missionState = input[6 + i * 2 + 1];
                IMission mission = new Mission(missionName, missionState);
                commando.addMissionsList(mission);
            }

            System.out.println(commando.toString());
        }
    }

    private static void makeEngineer(String[] input) {
        String id = input[1];
        String firstName = input[2];
        String lastName = input[3];
        Double salary = Double.valueOf(input[4]);
        String corps = input[5];
        if (corps.equals("Airforces") || corps.equals("Marines")) {
            IEngineer engineer = new Engineer(id, firstName, lastName, salary, corps);
            int iterator = (input.length - 6) / 2;
            for (int i = 0; i < iterator; i++) {
                String repairName = input[6+i*2];
                Integer repairTime = Integer.valueOf(input[6+i*2+1]);
                IRepair repair = new Repair(repairName, repairTime);
                engineer.addRepairsList(repair);
            }

            System.out.println(engineer.toString());
        }

    }

    private static void makeLeutenantGeneral(String[] input, ArrayList<IPrivate> privatesList) {
        String id = input[1];
        String firstName = input[2];
        String lastName = input[3];
        Double salary = Double.valueOf(input[4]);
        ILeutenantGeneral leutenantGeneral = new LeutenantGeneral(id, firstName, lastName, salary);
        int iterator = input.length - 5;
        for (int i = 0; i < iterator; i++) {
            String idSearchFor = input[5+i];
            privatesList.stream().filter(aPrivate -> aPrivate.getId().equals(idSearchFor)).forEach(leutenantGeneral::addPrivatesList);
        }

        System.out.println(leutenantGeneral.toString());
    }

    private static void makePrivate(String[] input, ArrayList<IPrivate> privatesList) {
        String id = input[1];
        String firstName = input[2];
        String lastName = input[3];
        Double salary = Double.valueOf(input[4]);
        IPrivate privateSoldier = new Private(id, firstName, lastName, salary);
        privatesList.add(privateSoldier);

        System.out.println(privateSoldier.toString());
    }
}
