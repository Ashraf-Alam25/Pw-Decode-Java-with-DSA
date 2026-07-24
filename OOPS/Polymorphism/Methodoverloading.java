package OOPS.Polymorphism;
// false polymorphism
class Calculator{
    public void add(int a, int b){
        System.out.println("int argument");
        
    }
    public void add(float a, float b){
        System.out.println("float argument");
        
    }
    public void add(double a, double b){
        System.out.println("double argument");
        
    }
}
public class Methodoverloading {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(0, 0);
        c.add(0.1, 0.1);
        c.add(0.1f, 0.9f);
    }
}
