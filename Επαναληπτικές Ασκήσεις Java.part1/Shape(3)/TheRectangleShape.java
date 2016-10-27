
public class TheRectangleShape extends Shape {
	private int sideA, sideB;

	public TheRectangleShape() {
		super();
	}// the default constructor

	public TheRectangleShape(int sideA, int sideB)// constructor
	{
		super(4);
		this.sideA = sideA;
		this.sideB = sideB;
	}

	// setters
	public void setSideA(int sideA) {
		this.sideA = sideA;
	}

	public void setSideB(int sideB) {
		this.sideA = sideB;
	}

	// getters
	public int getSideA() {
		return this.sideA;
	}

	public int getSideB() {
		return this.sideB;
	}

	public String toString() {
		return super.toString() + "The sideA is: " + this.sideA + " and the second side, sideB is: " + this.sideB + ".";
	}

	public boolean areEqual(TheRectangleShape a)
	// compares two rectangles
	{
		{
			return (a.sideA == this.sideA) && (a.sideB == this.sideB);
		}
	}

	public boolean isSquare()// checks if a rectangle is a
												// square
	{
		return this.sideA == this.sideB;
	}

	public void draw()// draws the contour of your shape on the console
	{
		for (int i = 0; i < this.sideA; i++) {
			for (int j = 0; j < this.sideB; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

	public TheRectangleShape copy()/*
									 * creates and returns an exact copy of a
									 * rectangle
									 */ {
		TheRectangleShape new_rectangle = new TheRectangleShape();
		new_rectangle.sideA = this.sideA;
		new_rectangle.sideB = this.sideB;
		return new_rectangle;
	}

	public double area() {
		return (this.sideA) * (this.sideB);
	}

	public double perimeter() {
		return 2 * (this.sideA + this.sideB);
	}


}
