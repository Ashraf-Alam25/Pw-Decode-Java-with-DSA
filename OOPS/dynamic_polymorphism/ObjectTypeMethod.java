package OOPS.dynamic_polymorphism;
class Parent{
    public Object methodOne(){
        return null;
    }
}
class Child extends Parent{
    public void methodOne(){
        System.out.println("Hello from child...");
    }
}
public class ObjectTypeMethod{
    public static void main(String[] args)
    {
        Parent p = new Child();
        p.methodOne();
    }
}