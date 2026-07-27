interface ICalculator{
    void add(int a,int b);
    void sub(int a,int b);
    void mul(int a,int b);
    void div(int a,int b);
}
abstract class CalculatorImpl implements ICalculator{
}
public class InterfaceExample2App{
    public static void main(String[] args){
        //ICalculator calculator;
        System.out.println("Abstract class created successfully.");
    }
}