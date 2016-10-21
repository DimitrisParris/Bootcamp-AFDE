public class Shape implements Agreeable {
	int weight, height;
	
	Shape(){}
	Shape(int weight, int height){this.weight=weight; this.weight=weight;}
	
	int calcArea(){
		return weight*height;
		}
	public void isSmallerThan(Agreeable other){
		Shape something = (Shape) other;
		if (this.calcArea()<something.calcArea()){
			System.out.println("The something is bigger than the other!");			
		}
	}
}
