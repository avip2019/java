import java.util.*;

public class list {

	public static void main(String[]args) 
	{
		List<String> l = Arrays.asList("avip","Niranjan","avip","rush","omkar","rush","avip");
		
		Set<String> s = new HashSet<>(l);
		
		for(String a: s)
		{   
			if(Collections.frequency(l,a)>1)
		{
			System.out.println(a+" :"+Collections.frequency(l,a));
			
		}
			else
			{
				
			}
		}
	}
}
