import java.util.*;

public class ClockAngle1 {
	public static void main(String[]args)
	{
		
		System.out.println("Enter Time : ");
		Scanner sc = new Scanner(System.in);
		
		int hr=sc.nextInt();
		int min=sc.nextInt();
		
		double  a=((hr*60)+min)*0.5;
		double b=min*6;
		double angle=(b-a);
		
		System.out.println("Angle Between Hour hand and Min hand when time is "+hr+":"+min+" and angle is:"+angle);
		
		
	}

}