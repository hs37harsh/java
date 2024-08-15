
import java.util.Scanner;

public class pattern2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for(int i=1;i<=4;i++){
                for(int j=1;j<1+i;j++){
                    if(i==1|i==n)
                System.out.print("*");
                }
                System.out.println();
            }
        }
}    
