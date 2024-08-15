import java.util.Scanner;
 
public class Temp{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the celsius_Temp") ;
        Float celsius_Temp  = Sc.nextFloat();
        Float Fahrenheit = celsius_Temp*9/5+32;
        System.out.println(Fahrenheit);
        Sc.close();

    }
}    