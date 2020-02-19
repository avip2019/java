

public class Rotate 
{

	
	public static void main(String[]args)
	{
		int a[][] = { {1,5,6},                                                                                                                                  
		              {2,4,7},
		              {3,9,8} };
		
		abc x = new abc();
		a = x.rowtocolumn(a);
		
		
		}
}	
	


class abc
	{ 
		 
	   public int[][] rowtocolumn(int a[][])
		{
		for(int i=0;i<a[0].length;i++)
		{
			for(int j=0,b=a[0].length-1;j<b;j++,b--)
			{
				int temp = a[j][i];
				a[j][i] = a[b][i];
				a[b][i]=temp;
				
			}
		
		}return a;
	  }
	}


	
	class xyz
	{
	public int[][] revers(int a[][]) 
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a[0].length;j++)
			{
				int temp = a[j][i];
				a[j][i] = a[i][j];
				a[i][j]=temp;
				
			}
		} return a;
		

				
	 
		
	}
	}