import java.util.Scanner;

public class evennos {
	
	public static void main(String args[])
	{
		int n;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the count of elements in an array :");
		n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements in the array :");
		for(int i = 0;i<n;i++)
		{
			a[i]=s.nextInt();
		}

		
		
		
		for(int i=0;i<n;i++)
		{
			
			if(a[i]%2!=0)
			{
				for (int j=i+1;j<n;j++)
				{
				  if(a[j]%2==0)
				  {
					  int temp;
					  temp=a[i];
					  a[i]=a[j];
					  a[j]=temp;
				  }
				}
        				
			}
			  System.out.println(a[i]);
			
			
			
			
		
		
		
		
			
		}
		s.close();
	}

}
