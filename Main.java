package uberM;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String T,Promo = " ",Payment,C;
		double distance;
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("WELCOME TO JUBER!");
		System.out.println(" ");
		
		System.out.println("A. Car");
		System.out.println("B. Motorcycle");
		System.out.println("C. Bicycle");
		System.out.println("CHOOSE YOUR TRANSPORT: ");
		T=scan.next();
		
		System.out.println("HOW MUCH DISTANCE YOU WANT TO TRAVEL?: ");
		distance=scan.nextDouble();
		
		System.out.println("CHOOSE YOUR PAYMENT METHOD: Online/Cash? ");
		Payment=scan.next();
		
		System.out.println("DO YOU HAVE ANY PROMO CODE? : YES/NO");
		C=scan.next();
		
		if(C.equals("YES"))
		{
			System.out.println("CHOOSE YOUR PROMO:");
			System.out.println("A. Flat");
			System.out.println("B. Percent");
			System.out.println("C. Capped Percent");
			Promo=scan.next();
		}
		
		if(T.equals("A")) {
			Car cp=new Car(distance,Promo,Payment);
			cp.info();
		}
		else if(T.equals("B")) {
			Motorcycle mp=new Motorcycle(distance,Promo,Payment);
			mp.info();
		}
		else if(T.equals("C")) {
			Bicycle bp=new Bicycle(distance,Promo,Payment);
			bp.info();
		}
	
		}
 }

	

