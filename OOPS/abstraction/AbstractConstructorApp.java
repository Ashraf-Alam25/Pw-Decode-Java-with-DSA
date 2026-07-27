abstract class Person{
    String name;
    int age;
    float height;
    Person(String name,int age,float height){
        this.name=name;
        this.age=age;
        this.height=height;
    }
}
class Student extends Person{
    int marks;
    float avg;
    Student(String name,int age,float height,int marks,float avg){
        super(name,age,height);
        this.marks=marks;
        this.avg=avg;
    }
    public void display(){
        System.out.println("Name is :: "+name);
        System.out.println("Age is :: "+age);
        System.out.println("Height is :: "+height);
        System.out.println("Marks is :: "+marks);
        System.out.println("Avg is :: "+avg);
    }
}
public class AbstractConstructorApp{
    public static void main(String[] args){
        Student student=new Student("ashraf",28,5.3f,100,53.5f);
        student.display();
    }
}