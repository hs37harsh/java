import java.util.Scanner;
 
public class basic{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the basic selary") ;
        float Selary = Sc.nextFloat();
        float hra = Selary+(30/100);
        float ta = Selary+(20/100);
        float da = Selary+(10/100);
        int pf = 1500;
        float NetSelary = Selary + hra + ta + da - pf;
        System.out.println("");
        System.out.println(NetSelary);
        System.out.println(NetSelary);
        System.out.println(NetSelary);
        Sc.close();
    }
}
