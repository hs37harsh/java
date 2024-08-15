import java.util.Scanner;
public class function_simple {
    static void printAman(double interset){
    System.out.println("This is the interset"+interset);
    }
     public static void main(String[] args) {
    System.out.println("Enter the principal");
    Scanner Sc = new Scanner(System.in);
    int prin = Sc.nextInt();

    System.out.println("Enter the rate");
    int rate = Sc.nextInt();

    System.out.println("Enter the time");
    int time = Sc.nextInt();

    int interset = (prin*rate*time)/100;
    System.out.println("interset"+interset);

    
        printAman(interset);
        Sc.close();
    }
    

    
}
