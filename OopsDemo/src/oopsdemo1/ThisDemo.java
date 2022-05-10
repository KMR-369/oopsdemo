package oopsdemo1;

public class ThisDemo {
	
	int age;
	
	//instance method
    //this keyword is used in instance mehod to access object
	void init(int age)
	{
		this.age = age; //this keyword refers to the current object which invokes the method
	}

	public static void main(String[] args) {
		
		ThisDemo td1 = new ThisDemo();
		td1.init(22);
		
		System.out.println("The value of age is :" +td1.age);
		

	}

}
