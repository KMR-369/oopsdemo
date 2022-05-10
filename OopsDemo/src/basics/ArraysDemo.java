package basics;

public class ArraysDemo {

	public static void main(String[] args) {
		int a[] = {20,14,16,12,18,10};//declaring and initializing the array
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("The size of the array is:"+a.length);
		System.out.println("The first element of the array is:"+a[0]);
		System.out.println("The last element of the array is:"+a[a.length-1]);
	}

}
