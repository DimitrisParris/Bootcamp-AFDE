
public abstract class Shape {
	protected int number_of_sides;
	// the Shape class
	// have one attribute, the number of sides

	Shape() // the default constructor
	{
	}

	Shape(int number_of_sides) // constructor
	{
		this.number_of_sides = number_of_sides;
	}

	public void setNumberOfSides(int number_of_sides) //setter
	{
		this.number_of_sides = number_of_sides;
	}

	public int getNumberOfSides() {
		return this.number_of_sides;
	}

	public abstract double area();

	public abstract double perimeter();

	public abstract void draw();

	public String toString() {
		return "The Shape has " + number_of_sides + " sides.";
	}

}
