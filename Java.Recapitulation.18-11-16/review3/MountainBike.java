package review3;

public class MountainBike extends Bicycle {
	public int seatHeight;
	
	public MountainBike(int startheight, int startcadence, int startspeed, int startgear){
		super(startcadence, startspeed, startgear);
		seatHeight=startheight;
	}
	
	public void setHeight(int newValue){
		seatHeight=newValue;
	}

}
