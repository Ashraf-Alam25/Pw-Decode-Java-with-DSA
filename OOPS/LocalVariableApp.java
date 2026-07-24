package OOPS;
class Calculator{
    public void add(int a, int b){
        int result = a+b;
        System.out.println("the sum is :: "+result);
    }
}
public class LocalVariableApp {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(5, 20);
    }
}
                             