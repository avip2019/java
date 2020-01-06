import java.util.*;

public class ElementRepeat
{
	public static void main(String[]args)
	{
		int a[]= {1,3,4,5,6,3,8,2,3,4,5,30,2,23,2,24,5,24,23,2,57,99};
		
	        Arrays.sort(a);
		int k=a[0],count=1;	
		for(int i=1;i<a.length;i++)
		{
			if(k!=a[i])
			{   if(count>1)
				System.out.println(k+" Is repeated "+count+" Times");
				count=1;
				k=a[i];
			}
			else
			
				count++;
				
		}
	
	}

}