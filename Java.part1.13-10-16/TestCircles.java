public class TestCircles {

	public static void main (String [] args){
			Circle a = new Circle();
			a.setX(12);
			a.setY(12);
			a.setRadius(23);
			int x = a.getX();
			int y = a.getY();
			int r = a.getRadius();
			a.print();
			Circle b = new Circle(3,4);
			b.print();
			Circle c = new Circle(9,8,6);
			c.print();
			Circle d = new Circle(1,1,1);
			Circle e = d;
			d.print();
			e.print();
			d.setX(2); d.setY(3); d.setRadius(2);
			d.print();
			System.out.println(Circle.number_of_circles);
}}