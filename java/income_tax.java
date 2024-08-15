import java.util.Scanner;
public class income_tax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the income");
Scanner  o =new Scanner(System.in);
int sallery=o.nextInt();
if(sallery<=10000) {
	System.out.println("no tax");
}
else if(sallery>10000 && sallery<=20000) {
	int amount=sallery*10/100;
	int total=sallery-amount;
	System.out.println("10% tax=" +amount);
	System.out.println("pay amount=" +total);
	
}
else if(sallery>20000 && sallery<=30000) {
	int amount=sallery*15/100;
	int total=sallery+amount;
	System.out.println("15% tax=" +amount);
	System.out.println("pay amount=" +total);
}
if(sallery>30000) {
	int amount=sallery*30/100;
	int total=sallery+amount;
	System.out.println("30% tax=" +amount);
	System.out.println("pay amount=" +total);
//int amount=sallery*
}

	}

}
