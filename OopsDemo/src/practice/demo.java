package practice;

import java.io.*;
import java.util.*;

class demo
{
	public static int realEstate(int input1,int input2,int input3,int[] input4) 
	{
		
		ArrayList<Integer> w = new ArrayList<Integer>();
		Arrays.sort(input4);
		int z=0;
		for(int i=input4.length-1;i>=0;i--)
		{
			int temp = (int) (input4[i]*Math.pow(2,z));
			if(temp<input2)
			{
				w.add(input4[i]);
				input2-=(input4[i]*Math.pow(2,z));
				z+=1;
			}
		}
		
		int s=0;
		for(int i=0;i<=w.size()-1;i++)
		{
			int a=(int) w.get(i) * (int)Math.pow(2,input3);
			s+= a; 
		}
		return s;
		
	}
	
	public static void main(String[] args)
	{
		int a = 4;
		int b = 46;
		int c = 20;
		int[] d = {7,15,11,17};
		System.out.println(realEstate(a,b,c,d));
	}
}