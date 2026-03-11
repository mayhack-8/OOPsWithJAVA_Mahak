/*
Question 1: Student File Management System
Create a Java program using OOP concepts to manage student records in a file.
Requirements
Create a class Student with the following attributes:
int id
String name
double marks
Create a class StudentManager that performs the following operations:
writeStudent() → Accept student details using Scanner and store them in a file named students.txt.
readStudents() → Read and display all student records from the file.
Implement Exception Handling for:
IOException while reading/writing files
InputMismatchException for incorrect user input.
If the file does not exist, display a proper message instead of crashing.
Create a Main class to test the functionality.
 */
import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
class Student{
    int id;
    String name;
    double marks;
     Student(int id, String name, double marks){
        this.id=id;
        this.name= name;
        this.marks= marks; 
     }
}
class StudentManager{
    void writeStudent(){
        Scanner sc = new Scanner (System.in);
        try{
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();

            double marks = sc.nextDouble();
            Student s= new Student(id,name,marks);
            FileOutputStream fos = new FileOutputStream("students.txt");
            String data = s.id + " " + s.name + " " + s.marks + "\n";
            byte arr[] = data.getBytes();
            fos.write(arr);

            fos.close();
            sc.close();
        }
        catch(InputMismatchException e){
            System.out.println("invalid input");
        }
        catch(IOException e ){
            System.out.println("error with file");
        }
    }
    void readStudents(){
        try{
        FileInputStream fis = new FileInputStream("students.txt");

            int ch;
            while((ch = fis.read()) != -1) {
                System.out.print((char)ch);
            }

            fis.close();

        }
        catch(IOException e) {
            System.out.println("Error reading file.");
        }

    }
    
}
public class Main {

    public static void main(String[] args) {

        StudentManager sm = new StudentManager();

        sm.writeStudent();
        sm.readStudents();
    }
}