package P03_DependencyInversionSkeleton;


public class PrimitiveCalculator {

    private CurrentStrategy currentStrategy;

    public PrimitiveCalculator(){
        this.currentStrategy = new AdditionStrategy();
    }

    public void changeStrategy(char operator){
        switch (operator){
            case '+': currentStrategy = new AdditionStrategy();
                break;
            case '-': currentStrategy = new SubtractionStrategy();
                break;
            case '*': currentStrategy = new MultiplyStrategy();
                break;
            case '/': currentStrategy = new DivideStrategy();
                break;
        }
    }

    public int performCalculation(int firstOperand, int secondOperand){
        return currentStrategy.Calculate(firstOperand, secondOperand);
    }
}
