import java.util.*;
public class armstorng {
    public static void main(String[] args) {
        int count=0;
        int sum =0;
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter number:");
    int num = Sc.nextInt();
    int a=num;
    int result = num;
    while(a > 0){
        a/= 10;
        count++;
    }
    //int C = long Count(num);
    while(num>0){
    int remainder = num%10;
    sum = (int) (sum +Math.pow(remainder,count)) ;}
        num = num /10;
    if(sum==result){
        System.out.println("num is armstorng"+sum);
    }
    else
    {
        System.out.println("num is not armstorng"+sum);
    }
    }
    
}
