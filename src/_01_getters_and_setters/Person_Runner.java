package _01_getters_and_setters;

public class Person_Runner {
	public static void main(String[] args) {
		
	
Person jim = new Person();
Person bob = new Person();
Person tim = new Person();
jim.setSuperpower("water breathing");
bob.setSuperpower("invisible");
tim.setSuperpower("fire breathing");
System.out.println(jim.toString());
System.out.println(bob.toString());
System.out.println(tim.toString());
	}
}
