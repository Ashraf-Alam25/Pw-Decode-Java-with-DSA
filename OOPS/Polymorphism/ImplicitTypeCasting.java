package OOPS.Polymorphism;
class Cal{
    public void add(int a){
        System.out.println("int argument");
    }
    public void add(float a){
        System.out.println("fload argument");
    }
    // public void add(double a){
    //     System.out.println("double argument");
    // }
}
public class ImplicitTypeCasting {
    public static void main(String[] args) {
        Cal c = new Cal();
        c.add('a');
        c.add(19L);
        //c.add(0.8);
    }
}
