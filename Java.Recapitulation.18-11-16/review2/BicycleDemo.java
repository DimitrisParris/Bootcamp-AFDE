package review2;

import review.Bicycle;

public class BicycleDemo {
	public static void main (String [] args){
		Bicycle bike1 = new Bicycle();
		Bicycle bike2 = new Bicycle();
		
		bike1.changeCadence(50);
		bike1.speedUp(10);
		bike1.changeGear(2);
		bike1.printStates();
		
		bike1.changeCadence(50);
		bike1.speedUp(10);
		bike1.changeGear(2);
		bike1.changeCadence(40);
		bike1.speedUp(10);
		bike1.changeGear(3);		
		bike1.printStates();
		
	}
}
