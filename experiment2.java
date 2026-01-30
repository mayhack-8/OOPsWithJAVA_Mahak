package javafolder.project;
//experiment 2: overloading in static methods 

public class experiment2 {
    public static void main(String[] args) {
        
        System.out.println("Circle area: " + experiment2.area(5.0));
        System.out.println("Rectangle area: " + experiment2.area(4.0, 6.0));
    }

    static double area(double radius) {
         return  3.14 * radius * radius; 
        }
    static double area(double length, double width) {
         return length * width; 
        }
}
