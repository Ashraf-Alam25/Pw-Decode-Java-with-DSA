class Parent{
    public void methodOne(){
        System.out.println("Hello from Parent class...");
    }
}
class Child extends Parent{
    protected void methodOne(){
        System.out.println("Hello from Child class...");
    }
}
public class CannotReduceScope{
    public static void main(String[] args){
        Parent p = new Child();
        p.methodOne();
    }
}
