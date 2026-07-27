interface ICalculator{
    void add(int a,int b);
    void sub(int a,int b);
}
class CalculatorAdvanced{
    public void mul(int a,int b){
        System.out.println("The mul is :: "+(a*b));
    }
    public void div(int a,int b){
        System.out.println("The div is :: "+(a/b));
    }
}
class CalculatorImpl extends CalculatorAdvanced implements ICalculator{
    @Override
    public void add(int a,int b){
        System.out.println("The sum is :: "+(a+b));
    }
    @Override
    public void sub(int a,int b){
        System.out.println("The diff is :: "+(a-b));
    }
}
public class HybridInheritanceApp{
    public static void main(String[] args){
        CalculatorImpl calculator=new CalculatorImpl();
        calculator.add(10,20);
        calculator.sub(100,20);
        calculator.mul(10,20);
        calculator.div(100,20);
    }
}