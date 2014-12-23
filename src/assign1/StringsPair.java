package assign1;
import java.io.*;
public class StringsPair {
	public static void main(String args[]) throws IOException
	{
		String a,b;
		int c=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter two strings:");
		a=br.readLine();
		b=br.readLine();
		int m=a.length();
		int n=b.length();
		for(int i=1;i<m;i++)
		{
			//System.out.println(a.substring(i-1, i+1));
			for(int j=1;j<n;j++)
			{
				if(a.substring(i-1, i+1).equals(b.substring(j-1, j+1)))
						{
							c++;
						}
			}
		}
		System.out.println(c);
	}
}