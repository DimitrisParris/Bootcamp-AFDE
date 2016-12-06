package review3;

public class Bicycle {
	public int cadence;
	public int gear;
	public int speed;
	
	public Bicycle(int startcadence, int startgear, int startspeed){
		cadence=startcadence;
		gear=startgear;
		speed=startspeed;
	}
	
	public void setCadence(int newValue){
		cadence=newValue;
	}
	
	public void setGear(int newValue)
	{
		gear=newValue;
	}
	
	public void applyBrake(int decrement){
		speed = speed - decrement;
	}
	
	public void speedUp(int increment){
		speed = speed + increment;
	}
}
