package OOPS.dynamic_polymorphism;
class Parent{
    void methodOne(){
        System.out.println("Hello from Parent class...");
    }
}
class Child extends Parent{
    public void methodOne(){
        System.out.println("Hello from Child class...");
    }
}
public class CanIncreaseScope {
    public static void main(String[] args){
        Parent p = new Child();
        p.methodOne();
    }
}
