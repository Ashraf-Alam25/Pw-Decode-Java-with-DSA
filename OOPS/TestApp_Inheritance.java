package OOPS;
class Person{
    public String name;
    public String address;
    public int age;
}
class Student extends Person{
    public int marks;
    public String grade;

    Student(String name, String address, int age, int marks, String grade){
        this.name = name;
        this.address = address;
        this.age = age;
        this.marks = marks;
        this.grade = grade;
    }
    public void disp(){
        System.out.println("Name is    :: "+name);
        System.out.println("Address is :: "+ address);
        System.out.println("Age is     :: "+age);
        System.out.println("Marks is   :: "+marks);
        System.out.println("Grade is   :: "+grade);
    }
}
public class TestApp_Inheritance {
    public static void main(String[] args) {
        Student student = new Student("ashraf", "delhi", 28, 99, "btech cse");
        student.disp();
    }
}
