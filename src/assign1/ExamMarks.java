package assign1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;



public class ExamMarks {
	public static void main(String args[]) throws IOException 	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int i,m=0;
		System.out.println("Enter the no. of questions:");
		int n=Integer.parseInt(br.readLine());
		char a[]=new char[n+1];
		char b[]=new char[n+1];
		System.out.println("Enter the exam key and answer key:");
		for(i=1;i<=n;i++)
			a[i]=(char) br.read();
	//	System.out.println("Enter the answer key:");
		for(i=1;i<=n;i++)
			b[i]=(char) br.read();
	/*	for(i=1;i<=n;i++)
		System.out.println(a[i]);
		for(i=1;i<=n;i++)
		System.out.println(b[i]);  */
		for(i=1;i<=n;i++)
		{
			//int r=a[i].compareTo(b[i]);
		if(a[i]==b[i])
		{
			m+=4;
		}
		else if(b[i]!= '?')
			m-=1;
		//System.out.println(m);
		}
		
		
		System.out.println(m);
		
	//	Scanner scan = new Scanner(System.in);
		// char examkey[]=scan.next().toCharArray();
	}

}
