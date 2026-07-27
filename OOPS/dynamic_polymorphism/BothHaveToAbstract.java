abstract class Parent{
    public abstract void methodOne();
}
class Child extends Parent{
    @Override
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
