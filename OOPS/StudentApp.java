package OOPS;

class Student {
    private String name;
    private int rollNo;
    private String address;
    
    public void setName(String name){
        this.name = name;
    }
    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public String getName(){
        return name;
    }
    public int getRollNo(){
        return rollNo;
    }
    public String getAddress(){
        return address;
    }
    
}
public class StudentApp {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("Ashraf");
        s1.setRollNo(231310);
        s1.setAddress("delhi");
        System.out.println("Name is         :: " + s1.getName());
        System.out.println("Roll No is      :: " + s1.getRollNo());
        System.out.println("Name is Address :: " + s1.getAddress());
    }
}
