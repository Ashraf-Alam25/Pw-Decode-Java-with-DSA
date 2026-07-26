package OOPS.static_Polymorphism;
class AdvancedCalculator{
    public void add(int... args){
        int sum = 0;
        for (int ele : args) {
            sum += ele;
        }
        System.out.println(sum);
    }
}
public class var_argsMethod {
    public static void main(String[] args) {
        AdvancedCalculator ac = new AdvancedCalculator();
        ac.add();
        ac.add(1);
        ac.add(0,2,3,4,5);
        ac.add(4,3);
    }
}
