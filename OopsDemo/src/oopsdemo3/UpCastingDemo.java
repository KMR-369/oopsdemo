package oopsdemo3;

class Game
{
        public void play(){
        System.out.println("Game is being played");
        }
        
        public void noOfPlayers(){
        System.out.println("No of players depend upon the game");
        }
        
        public void winner(String name){
        System.out.println("Winner is : " + name);
        }
}

class Cricket extends Game
{

	public void noOfPlayers()
	{
		System.out.println("22");
	}

	public void teams()
	{
		System.out.println("2");
	}
}

class Chess extends Game
{

	public void noOfPlayers()
	{
		System.out.println("2");
	}
}

//UpCasting is used when you want to generalize a function or
//property so that it can be used by any of it’s sub type.
public class UpCastingDemo {

	public static void main(String[] args)
	{
		Game g = new Cricket(); // UpCasting -- call only the overridden & base class methods
		Game g1 = new Chess();
		
		g.play();   //Dynamic Binding 
		g.noOfPlayers();
		g.winner("A");
		
	//	g.teams();  //compiler error
		
		Cricket c = new Cricket();
		c.teams(); // static binding
		
		g1.play();  //base class method
		g1.noOfPlayers();  //overridden method
		g1.winner("Vish");  //base class method
		
		System.out.println("*****************************");
		
		Game g100;
		
		g100 = new Cricket();
		
		g100.play();
		g100.noOfPlayers();
		g100.winner("DC");
		
		g100 = new Chess();
		
		g100.play();
		g100.noOfPlayers();
		g100.winner("Vishwanathan Anand");
		System.out.println("**************************");
		
		Test t1=new Test(100,200,300);
        System.out.println("Defaut Variable :"+t1.a);
        
        Test2 t2 = new Test2(100,200,300);
        t2.print(); //invoke default method
	}

}
