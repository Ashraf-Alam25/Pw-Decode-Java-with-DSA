interface ICalculator{
    void add(int a,int b);
    void sub(int a,int b);
    void mul(int a,int b);
    void div(int a,int b);
}
class CalculatorImpl implements ICalculator{
    @Override
    public void add(int a,int b){
        System.out.println("The sum is :: "+(a+b));
    }
    @Override
    public void sub(int a,int b){
        System.out.println("The diff is :: "+(a-b));
    }
    @Override
    public void mul(int a,int b){
        System.out.println("The mul is :: "+(a*b));
    }
    @Override
    public void div(int a,int b){
        System.out.println("The div is :: "+(a/b));
    }
}
public class InterfaceExample3App{
    public static void main(String[] args){
        ICalculator calculator=new CalculatorImpl();
        calculator.add(10,20);
        calculator.sub(100,20);
        calculator.mul(10,20);
        calculator.div(100,20);
    }
}