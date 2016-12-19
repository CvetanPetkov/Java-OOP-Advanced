package P03_DependencyInversionSkeleton;

public class DivideStrategy implements CurrentStrategy{

    public int Calculate(int firstOperand, int secondOperand) {

        return firstOperand / secondOperand;
    }

}
