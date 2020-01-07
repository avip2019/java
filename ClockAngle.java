
public class ClockAngle {
	public static void main(String[]args)
	{
		int hr=6,min=50;
		double  a=((hr*60)+min)*0.5;
		double b=min*6;
		double angle=(b-a);
		
		System.out.println("Angle Between Hour hand and Min hand when time is 6:50 : "+angle);
		
		
	}

}
