package OOPS.dynamic_polymorphism;
class Parent{
    public final void methodOne(){
        System.out.println("ParentClass:: methodOne()");
    }
}
class Child extends Parent{
    public void methodOne(){
        System.out.println("ChildClass:: methodOne()");
    }
}
public class CannotOverideFinal {
    public static void main(String[] args){
        Parent p = new Child();
        p.methodOne();
    }
}
