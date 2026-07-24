package OOPS.Polymorphism;
class Cals{
    public void add(int a, float b){
        System.out.println("int - float argument");
    }
    public void add(float a, int b){
        System.out.println("float-int argument");
    }
    
}
public class AmbigiusMethod {
    public static void main(String[] args) {
        Cals c = new Cals();
        c.add(0, 0.1f);
        c.add(0.12f, 0);
        //c.add(0,0);
    }
}
