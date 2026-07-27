abstract class Bird{
    public abstract void fly();
    public abstract void eat();
}
class Sparrow extends Bird{
    @Override
    public void fly(){
        System.out.println("Sparrow fly @short height");
    }
    @Override
    public void eat(){
        System.out.println("Sparrow eat grains...");
    }
}
abstract class Eagle extends Bird{
    @Override
    public void fly(){
        System.out.println("Eagle fly @very very height");
    }
    @Override
    public abstract void eat();
}
class SerpentEagle extends Eagle{
    @Override
    public void eat(){
        System.out.println("Serpent Eagle eats snakes...");
    }
}
class GoldenEagle extends Eagle{
    @Override
    public void eat(){
        System.out.println("Golden Eagle catches prey over the ocean...");
    }
}
class Crow extends Bird{
    @Override
    public void fly(){
        System.out.println("Crow fly @medium height...");
    }
    @Override
    public void eat(){
        System.out.println("Crow eat grains...");
    }
}
class Sky{
    public void allowBird(Bird ref){
        ref.fly();
        ref.eat();
        System.out.println();
    }
}
public class BirdAbstractionApp{
    public static void main(String[] args){
        Sky sky=new Sky();
        sky.allowBird(new Sparrow());
        sky.allowBird(new SerpentEagle());
        sky.allowBird(new GoldenEagle());
        sky.allowBird(new Crow());
    }
}