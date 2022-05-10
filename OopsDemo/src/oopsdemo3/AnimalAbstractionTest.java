package oopsdemo3;

abstract class Animal
{
	public void eat()
	{
		System.out.println("I can eat");
	}
	
	abstract void makeSound(); // abstract Method- without body
	
}

class Dog extends Animal
{
	@Override
	void makeSound() 
	{
		System.out.println("Bark Bark");
	}	
}

class Cat extends Animal
{
	@Override
	void makeSound()
	{
		System.out.println("Mew Mew");
	}
}
public class AnimalAbstractionTest {

	public static void main(String[] args) 
	{
		//compiler error- cannot instantiate Abstract classes
		//Animal a = new animal(); 
		Dog d1 = new Dog();
		Cat c1 = new Cat();
		
		d1.makeSound();
		d1.eat();
		
		c1.makeSound();
		c1.eat();
	}

}
