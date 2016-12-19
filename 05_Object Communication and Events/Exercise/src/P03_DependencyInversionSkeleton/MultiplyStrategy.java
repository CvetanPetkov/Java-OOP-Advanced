package P03_DependencyInversionSkeleton;

public class MultiplyStrategy implements CurrentStrategy{

    public int Calculate(int firstOperand, int secondOperand) {

        return firstOperand * secondOperand;
    }

}
