import java.util.*;

public class leap_year { 
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("year");
        int Year = Sc.nextInt();
        if (Year%4==0|| (Year%100==0 && Year%400==0 )){
            System.out.println("leap_year");
        }5
        else{
            System.out.println("not leap_year");
        }
    }
}

    
