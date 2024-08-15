import java.util.*;
public class hello {
    public static void main(String[] args) {
        int a,b;
       Scanner sc=new Scanner(System.in);
       System.out.println("entr the fisrt num");
       a=sc.nextInt();
       System.out.println("entr the second num");
       b=sc.nextInt();
      System.out.println("befor swap");
      System.err.println("a="+a);
      System.err.println("a="+b);
      System.out.println("after swap");
      a=a+b;//2,3=5
      b=a-b;//5-3=2
      a=a-b;//5-2=3
        System.out.println("num="+a);
        System.out.println("num="+b);
    }
    
}
