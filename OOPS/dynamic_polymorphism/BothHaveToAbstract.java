package OOPS.dynamic_polymorphism;
abstract class Parent{
    public abstract void methodOne();
}
class Child extends Parent{
    public void methodOne(){
        System.out.println("ChildClass:: methodOne()");
    }
}
public class BothHaveToAbstract {
    public static void main(String[] args){
        Parent p = new Child();
        p.methodOne();
    }
}
