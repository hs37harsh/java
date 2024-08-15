import java.util.Scanner;

public class language {
    public static void main(String[] args){
    Scanner Sc = new Scanner(System.in);
    int choic_one;
    System.out.println("choic_one") ;
    choic_one = Sc.nextInt();
    switch(choic_one) 
    {
        case 1:
          System.out.println("hindi");
            
            break;
            case 2:
            System.out.println("english");
            break;
    
        default:
        System.out.println("not present");
            break;}
        
        
    }

    
}
