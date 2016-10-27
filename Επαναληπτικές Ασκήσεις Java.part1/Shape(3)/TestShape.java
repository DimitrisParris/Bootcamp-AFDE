
public class TestShape {

	public static void main(String[] args) {
		
		TheRectangleShape w = new TheRectangleShape(4, 7);
		w.draw();
		TheRectangleShape z = new TheRectangleShape(3, 4);
		System.out.println("Is this sideA = sideB ? " + z.isSquare());
		System.out.println("Is this sideA = sideB ? " + z.areEqual(w));
		TheRectangleShape q = w.copy();
		System.out.println(q.getSideA() + " " + q.getSideB());
		
		Shape rer1 = new TheRectangleShape(2,3);
		TheRectangleShape rec2 = new TheRectangleShape(3,5);
		
		System.out.println(rec2.isSquare());
		System.out.println(((TheRectangleShape)rer1).isSquare());
		
		System.out.println(rec2.areEqual());
		System.out.println(((TheRectangleShape)rer1).areEqual());
		
	}

}
