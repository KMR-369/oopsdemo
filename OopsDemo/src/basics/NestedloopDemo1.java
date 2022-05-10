package basics;

public class NestedloopDemo1 {

	public static void main(String[] args) {
		int  weeks=3;
        int days=7;
        int i=1;
       
        //outer loop
        while(i <=weeks)                    // 1  2  3  -3 times
        {
            System.out.println("Week :"+i);
           
            //inner loop
            for(int j=1;j<=days;++j)       // 7  7   7   -21 times
            {
                System.out.println("\t"+"Day :"+j);
            }
            ++i;
        }

	}

}