class Parent {
    public void property() {
        System.out.println("Land+Cash+Gold");
    }
    public void marry() {
        System.out.println("Relative Girl");
    }
}
class Child extends Parent {
    @Override
    public void marry() {
        System.out.println("Some Other Girl...");
    }
}
public class Test {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        p1.property();
        p1.marry();
        System.out.println();

        Child c1 = new Child();
        c1.property();
        c1.marry();
        System.out.println();

        Parent p2 = new Child();
        p2.property();
        p2.marry();
    }
}