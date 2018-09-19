package uberM;

public class Motorcycle extends Transports {
	int b_fare=30;
	double d_fare;
	double distance;
	double duration;
	double speed=70;
	double dur_fare;
	double t_fare;
	double p_fare;
	double p_check;
	double o_fare;
	double g_fare;
	String Promo;
	String Payment;
	
	Motorcycle(double d,String Promo,String Payment){
		this.distance=d;
		this.Promo=Promo;
		this.Payment=Payment;
	}
	
	
	@Override
	void info() {
		System.out.println("Base Fare: "+b_fare+ " taka");
		d_fare=distance*15.0;
		System.out.println("Distance Fare: "+ d_fare+ " taka"+ "("+distance+"km)");
		duration=distance/speed;
		dur_fare=duration*120;
		System.out.println("Duration Fare: "+dur_fare+ " taka"+"("+duration*60+"Minutes)");
		t_fare=b_fare+d_fare+dur_fare;
		System.out.println("Total Fare: "+t_fare+" taka");
		
		if(Promo.equals("A")||Promo.equals("B")||Promo.equals("C")) {
			if(Promo.equals("A")) {
				p_fare=t_fare-50;
				System.out.println("Promo Fare: "+p_fare+ " taka");
			}
			
			else if(Promo.equals("B")) {
				p_fare=t_fare-(t_fare*0.2);
				System.out.println("Promo Fare: "+p_fare+ " taka");
			}
			
			else if(Promo.equals("C")) {
				p_check=t_fare*0.25;
				if(p_check<60) {
					p_fare=t_fare-p_check;
					System.out.println("Promo Fare: "+p_fare+ " taka");
				}
				else {
					p_fare=t_fare-60;
					System.out.println("Promo Fare: "+p_fare+ " taka");
				}
			}
		}
		
		else 
			p_fare=t_fare;
		
		
		if(Payment.equals("Online")) {
			o_fare=p_fare-(p_fare*0.1);
			System.out.println("Online Payment Discount : "+p_fare*0.1+" taka");
			g_fare=o_fare;
		}
		else
			g_fare=p_fare;
		
		System.out.printf("Grand Total Fare: "+g_fare+" taka");
		
	}
}
