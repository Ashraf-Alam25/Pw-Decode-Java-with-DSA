package OOPS.dynamic_polymorphism;
class Parent{
    private void methodOne(){
        System.out.println("Hello from Parent class...");
    }
}
class Child extends Parent{
    private void methodOne(){
        System.out.println("Hello from Child class...");
    }
}
public class PrivateCannotAccess {
    public static void main(String[] args){
        Parent p = new Child();
        p.methodOne();
    }
    
}
