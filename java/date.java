

import java.util.Scanner;

public class date{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the no 1 to 7");
		Scanner o =new Scanner(System.in);
		int day=o.nextInt();
		if(day==1) {
			System.out.println("Sunday"+day);
			
			
		} else if(day==2) {
			System.out.println("Monday"+day);
			
			
		}else if(day==3) {
			System.out.println("Tuesday"+day);
			
			
		}else if(day==4) {
			System.out.println("Wednesday"+day);
			
			
		}else if(day==5) {
			System.out.println("Thursday"+day);
			
			
		} else if(day==6) {
			System.out.println("Friday"+day);
			
			
		}else if(day==7) {
			System.out.println("Saturday"+day);
			
			
		}
        if(day>7){
			System.out.println("not valid");
			
			
		}

	}

}