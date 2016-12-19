package p02_KingsGambit.contracts;

public interface King {

    void killUnit(String unitToKill);

    void attackKing();

    String getName();

    void addUnit(Unit unit);
}
