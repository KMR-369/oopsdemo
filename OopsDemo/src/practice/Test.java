package practice;

import java.util.Scanner;

class Java
{
	int n;
	int a[] = new int[n];
	public Java(int n, int[] a) 
	{
		this.n = n;
		this.a = a;
	}
	int calculate()
	{
		int b[] = new int[n];
		for(int i=0;i<this.n;i++)
		{
			int s=0;
			for(int j=0;j<this.n;j++)
			{
				int g = a[j]-(j+1);
				if(g>0)
				{
					s+=g;
				}
				else
				{
					s+=(-1*g);
				}
			}
			b[i] = s;
			
		}
		int min = b[0];
		for(int i:b)
		{
			if(i<min)
			{
				min = i;
			}
		}
		return min;
	}
}
public class Test {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n;
		n = s.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = Integer.parseInt(s.next());
		}
		s.close();
		Java j = new Java(n,a);
		System.out.println(j.calculate());
	}
}
