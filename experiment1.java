package javafolder.project;
//package name is javafolder(main folder) and project is subfolder
//experiment 1: default and parameterised constructor
public class experiment1{
    public static void main(String[] args) {
        Student s1 = new Student();                     
        Student s2 = new Student("mahak", 19, 10389);     
        s1.display();
        s2.display();
    }
}

class Student {
    String name;
    int age;
    int uid;


    public Student() {
        this.name = "mahak";
        this.age = 19;
        this.uid = 10389;
    }

    public Student(String name, int age, int uid) {
        this.name = name;
        this.age = age;
        this.uid = uid;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Roll: " + uid);
    }
}

