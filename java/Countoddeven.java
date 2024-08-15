import java.util.Scanner;
public class Countoddeven {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        
        Scanner Sc= new Scanner(System.in);
        int n = Sc.nextInt();
        if(n%n==0||n%1==n){
        System.out.println("perfect number");

    }
    else{
        System.out.println("not a perfect number");

    }

}



    
}
