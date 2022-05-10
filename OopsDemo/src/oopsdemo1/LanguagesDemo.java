package oopsdemo1;

//program to demonstrate constructors in java
class Language
{
	private String s;
	private int version;
	
	Language() //implicit/No- Args constructor
	{
		System.out.println("Iam an Implicit Constructor");
		s = "Python";
		System.out.println("Hello from: "+s);
	}
	Language(String lang) //parameterized constructor
	{
		System.out.println("Iam an parameterized Constructor");
		this.s = lang;
		System.out.println("Hello from: "+s);
	}
	Language(String lang,int ver) //parameterized constructor with 2 Args
	{
		System.out.println("Iam a Parameterized Constructor with 2 Arguments");
		this.s = lang;
		this.version = ver;
		System.out.println("Hello from : "+s+" V."+ver);
	}
}
public class LanguagesDemo {

	public static void main(String[] args) {
		
		Language l1 = new Language("C Language"); // automatically invokes parameterized constructor
		Language l2 = new Language(); // automatically invokes implicit constructor
		Language l3 = new Language("Java");
		Language l4 = new Language();
		Language l5 = new Language("Ruby",2); // automatically invokes 2 Args parameterized constructor
		

	}

}
