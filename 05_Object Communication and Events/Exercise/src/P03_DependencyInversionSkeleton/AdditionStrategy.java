package P03_DependencyInversionSkeleton;

public class AdditionStrategy implements CurrentStrategy{

    @Override
    public int Calculate(int firstOperand, int secondOperand){

        return firstOperand + secondOperand;
    }
}
