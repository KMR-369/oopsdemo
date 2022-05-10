package basics;
public class OddEvenWhile {
	public static void main(String[] args) {
		System.out.println("ODD\tEVEN");
        System.out.println("----\t-----");
        int i=1;
        while(i<=10)
        {
            if(i%2==1)
            {
                System.out.print(i);
            }
            else
            {
                System.out.println("\t"+i);
            }
            i=i+1;
        }
	}

}