import java.util.Scanner;
 
public class result{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Student name:-") ;
        String Student_Name  = Sc.nextLine();
        System.out.println("Class:-");
        int Cl = Sc.nextInt();
        System.out.println("Subject:-");

        System.out.print("Hindi = ");
        float Hindi = Sc.nextFloat();
        System.out.print("English = ");
        Float English = Sc.nextFloat();
        System.out.print("Math = ");
        Float Math = Sc.nextFloat();
        System.out.print("Physics = ");
        Float Physics = Sc.nextFloat();
        System.out.print("Chemistry = ");
        Float Chemistry = Sc.nextFloat();
        System.out.print("Biology = ");
        Float Biology = Sc.nextFloat();
        float Total_avg_marks = Hindi + English + Math + Physics + Chemistry + Biology ;
        System.out.println(" Total Marks"+Total_avg_marks);
        float Percentage = (Total_avg_marks/600)*100;
        System.out.println(Percentage);
        Sc.close();
        





    }    
}    
