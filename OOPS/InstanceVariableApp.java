package OOPS;
class Student{
    String name;
    int age;
    String address;

    Student(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;

    }
    public void print(){
        System.out.println("name is      : "+name);
        System.out.println("age is       : "+age);
        System.out.println("address is   : "+address);
    }
}
public class InstanceVariableApp {
    public static void main(String[] args) {
        Student s1 = new Student("ashraf",28,"brindaban takiya tola");
        s1.print();
        Student s2 = new Student("tam",28,"brindaban takiya tola gopalganj");
        s2.print();
    }
}
