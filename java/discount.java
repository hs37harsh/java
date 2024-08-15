import java.util.Scanner;
public class discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the amount");
Scanner  o =new Scanner(System.in);
int amount=o.nextInt();
if(amount>1000 && amount<=5000) {
	int save=amount*5/100;
	int total=amount-save;
	System.out.println("5%off=" +save);
	System.out.println("pay amount=" +total);
}
else if(amount>5000 && amount<=10000) {
	int save=amount*10/100;
	int total=amount-save;
	System.out.println("10%off=" +save);
	System.out.println("pay amount=" +total);
	
}
else if(amount>10000 && amount<=20000) {
	int save=amount*15/100;
	int total=amount-save;
	System.out.println("15%off=" +save);
	System.out.println("pay amount=" +total);
	
}
else if(amount>20000 ) {
	int save=amount*25/100;
	int total=amount-save;
	System.out.println("25%off=" +save);
	System.out.println("pay amount=" +total);
}
    }
}
