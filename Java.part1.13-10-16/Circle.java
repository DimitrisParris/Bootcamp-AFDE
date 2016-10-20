class Circle {
	private int x, y, r; //
	public static int number_of_circles = 0;
	private static final double pi=3.14;
	public void setX(int x) {this.x = x; }/* Sets the x */
	public int getX() { return this.x; }/* Returns the x  */
	public void setY(int y)  { this.y = y; }/* Sets the y  */
	public int getY() { return this.y; }/* Returns the y */
	public void setRadius(int r)  { this.r = r; }/* Sets the r */
	public int getRadius() { return this.r; }/* Returns the r */

	Circle()//A constructor method that initializes the values of my objects
	{
	    this.x = this.y = 0;
	    this.r = 3;
	    number_of_circles++;
	    }
	Circle(int x, int y)/* Overloaded constructor */
	{
			this.x = x;
			this.y = y;
			number_of_circles++;
	}
	Circle(int x, int y, int r)/* Overloaded constructor */
	{
			this.x = x;
			this.y = y;
			this.r = r;
			number_of_circles++;
	}
	public double calculateArea(){ double o = pi*(this.r)*(this.r); return o; }
	public double calculatePerimeter(){ double o = 2*pi*(this.r); return o; }
	public Circle copy() /*Copy constructor*/
	   { Circle new_circle = new Circle();
	    new_circle.x = this.x;
	    new_circle.y = this.y;
	    new_circle.r = this.r;
	    return new_circle;
}
	public void print()//print method
	{
	System.out.println("Hello, I'm circle (" + this.x + "," + this.y + ") and my radius is " + this.r);
		}
		// Checks if two Circles (this & c) have common centers
		// If yes it returns true, otherwise, it returns false
		public boolean cocentric(Circle c) {
			return (this.x == c.x && this.y == c.y);
	}
}
