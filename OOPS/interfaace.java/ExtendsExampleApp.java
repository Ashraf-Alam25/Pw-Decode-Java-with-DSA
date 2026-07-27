class One{
    public void methodOne(){
        System.out.println("Method One");
    }
}
class Two extends One{
    public void methodTwo(){
        System.out.println("Method Two");
    }
}
public class ExtendsExampleApp{
    public static void main(String[] args){
        Two obj=new Two();
        obj.methodOne();
        obj.methodTwo();
    }
}