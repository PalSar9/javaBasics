import java.io.*;
import java.util.*;

class PrimeNumber
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=ob.nextInt();
		

		for(int j=1;j<=num;j++)
		{
			int count=0;
			for(int i=j-1;i>=2;i--)
			{
				if(j%i==0)
					count=count+1;
			}
			if(count==0)
				System.out.println(j);
			
				
		}
	}
}
