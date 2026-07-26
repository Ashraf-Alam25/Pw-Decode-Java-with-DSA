package OOPS.dynamic_polymorphism;
class Parent{
    public Object methodOne(){
        return null;
    }
}
class Child extends Parent{
    public String methodOne(){
        System.out.println("Hello from child...");
        return null;
    }
}
public class ObjectStringMethod{
    public static void main(String[] args){
        Parent p = new Child();
        p.methodOne();
    }
}