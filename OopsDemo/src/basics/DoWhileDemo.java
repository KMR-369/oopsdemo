package basics;

import java.util.Scanner;

//Java program to find the sum of positive numbers using do while loop

public class DoWhileDemo {
	public static void main(String[] args) {
		int sum = 0;
        int number = 0;
 
        // create an object of Scanner class
        Scanner s = new Scanner(System.in);

        // do...while loop continues 
        // until entered number is positive
        do {
          // add only positive numbers
          sum += number;
          System.out.println("Enter a number");
          number = s.nextInt();
          System.out.println(number);
        } while(number >= 0); 

        System.out.println("Sum = " + sum);
        s.close();
	}
}
