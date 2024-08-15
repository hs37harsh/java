 import java.util.Scanner;
public class Bmi{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your weight in Kg") ;
        float weight = Sc.nextFloat();
        System.out.println("Enter your height in meter");
        float height = Sc. nextFloat();
        float BMI = weight/(height*height);
        System.out.println(BMI);
        Sc.close();
    }
}
