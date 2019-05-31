package _02_sea_creature;

import java.util.jar.Attributes.Name;

public class Spongebob {
public static void main(String[] args) {
	SeaCreature jim = new SeaCreature("bob");
	jim.eat();
	jim.laugh();
	SeaCreature patrick = new SeaCreature("jim");
	SeaCreature squidward = new SeaCreature("slimy");
	patrick.getName();
	patrick.eat();
	patrick.laugh();
	squidward.getName();
	squidward.eat();
	squidward.laugh();
	

}
}
