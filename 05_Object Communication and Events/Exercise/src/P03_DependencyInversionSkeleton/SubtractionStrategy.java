package P03_DependencyInversionSkeleton;

public class SubtractionStrategy implements CurrentStrategy{

    public int Calculate(int firstOperand, int secondOperand) {

        return firstOperand - secondOperand;
    }
}
