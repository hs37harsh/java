import java.util.Scanner;
public class funciton_Area_perimeter {
    static void printArea(double Area){
        System.out.println("Area"+Area);}
        static void printPerimeter(double perimeter){
        System.out.println("perimeter"+perimeter);
       }
       public static void main(String[] args) {

        System.out.println("Enter the length");
        Scanner.Sc=new Scanner(System.in);
        int length = Sc.nextInt();

        System.out.println("Enter the breadth");
        int breadth = Sc.nextInt();

        int Area = length*breadth;
        int perimeter = 2*(length+breadth);
        
        printArea(Area);
        printPerimeter(perimeter);
    



         



       }
    
}
