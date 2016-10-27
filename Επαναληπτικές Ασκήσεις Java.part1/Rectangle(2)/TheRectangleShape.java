
public class TheRectangleShape {
	private int sideA, sideB;

	public TheRectangleShape() {
	}// the default constructor

	public TheRectangleShape(int sideA, int sideB)// constructor
	{
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
		return "The sideA is: " + this.sideA + " and the second side, sideB is: " + this.sideB + ".";
	}

	public boolean areEqual(TheRectangleShape a)
	// compares two rectangles
	{
		{
			return (a.sideA == this.sideA) && (a.sideB == this.sideB);
		}
	}

	public boolean isSquare(TheRectangleShape b)// checks if a rectangle is a
												// square
	{
		return b.sideA == b.sideB;
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
	public TheRectangleShape copy()/*creates and returns an exact copy of a rectangle*/{
		TheRectangleShape new_rectangle = new TheRectangleShape();
		new_rectangle.sideA = this.sideA;
		new_rectangle.sideB = this.sideB;
	    return new_rectangle;
	}
	public static void main(String[] args) {
		TheRectangleShape w = new TheRectangleShape(4, 7);
		w.draw();
		TheRectangleShape z = new TheRectangleShape(3,4);
		System.out.println("Is this sideA = sideB ? " + z.isSquare(z));
		System.out.println("Is this sideA = sideB ? " + z.areEqual(w));
		TheRectangleShape q = w.copy();
		System.out.println(q.getSideA() +" "+q.getSideB());
	}
}
