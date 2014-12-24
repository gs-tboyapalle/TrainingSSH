package assign1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MergeArrays {
	public static void main(String args[]) throws IOException
	{
		String s1,s2;
		int i,m,n,c=0,t=1;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first string:");
		s1=br.readLine();
		m=s1.length();
		char[] c1=s1.toCharArray();
		System.out.println(c1);
		System.out.println(m);
		System.out.println("Enter second string:");
		s2=br.readLine();
		n=s2.length();
		System.out.println(n);
		char c3[]=new char[m+n];
		char[] c2=s2.toCharArray();
		System.out.println(c2);
		c3[0]=c1[0];
		for(i=1;i<m;i++)
		{ int a=0;
			for(int j=0;j<i;j++)
			{
				if(c1[i]==c3[j])
					a++;
			}
			if(a==0)
			{
				c3[t]=c1[i];
				t++;
			}
		}
		//int x=t-1;
		/*for(i=0;i<m;i++)
		{
			c3[i]=c1[i];
		} */
		for(i=0;i<n;i++)
		{
			c=0;
			for(int j=0;j<t;j++){
				
				if(c2[i]==c3[j])
					c++;
			}
			if(c==0)
			{
				c3[t]=c2[i];
				t++;
			}
		}
		
		System.out.println(c3);
	}

}
