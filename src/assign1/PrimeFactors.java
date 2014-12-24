package assign1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeFactors {
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n,i,j,c=0,t=0,l=0,c1=0;
		System.out.println("Enter any number:");
		n=Integer.parseInt(br.readLine());
		for(i=1;i<=n;i++)
		{
			if((n%i)==0)
				c++;
		}
		if(c==2)
		{
			System.out.println(n+"^"+1);
			return;
		}
			for(i=1;i<=n;i++)
			{
				c=0;
				for(j=1;j<=i;j++)
				{
					if((i%j)==0)
					c++;
				}
				if((c==2) && (n%i)==0 )
				{

					if(c1>0)
						System.out.print("*");
					c1++;
					while((n%i)==0){
						n=n/i;
						l++;
					}
					System.out.print(i+"^"+l);	
					l=0;
					//if(c1>1)
					//	System.out.print("*");
				}
				
			}   
		
}
}
