package mapdemo;

import java.util.HashMap;

public class HashMapDemo1 {

	public static void main(String[] args) {

		HashMap<Integer,String> languages = new HashMap<>();
		
		languages.put(1, "Java");
		languages.put(2, "Python");
		languages.put(3, "JavaScript");
		
		System.out.println("HashMap: "+languages);
		
		
		
	}

}
