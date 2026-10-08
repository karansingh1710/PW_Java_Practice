package Inheritence;

// Base Class,Parent class, Super Class
class Human{
    int age;
    void sleep(){
        age=18;
        System.out.println("Human needs good sleep");
        System.out.println("Human Age : "+age);
    }
}

class Student extends Human{   // Derieved Class, Child Class , Sub Class

}
public class Demo1 {
    public static void main(String[] args) {
        Student s=new Student();
        s.age=20;
        System.out.println("Student age "+s.age);
        s.sleep();
        System.out.println("Student age "+s.age);
    }
}
