package review4;

import java.awt.Point;

import com.sun.javafx.geom.Rectangle;

public class CreateObjectDemo {

	public static void main(String[] args) {
		
		Point originOne = new Point(23,94);
		Rectangle rectOne = new Rectangle(100,200);
		Rectangle rectTwo = new Rectangle(50,100);
		
		System.out.println("Width of rectOne:"+rectOne.width);
		System.out.println("Height of rectOne:"+rectOne.height);
		System.out.println("Area of rectOne:"+ rectOne.getArea());
		
		rectTwo.origin = originOne;
		
		// display rectTwo's position
        System.out.println("X Position of rectTwo: " + rectTwo.origin.x);
        System.out.println("Y Position of rectTwo: " + rectTwo.origin.y);
		
        // move rectTwo and display its new position
        rectTwo.move(40, 72);
        System.out.println("X Position of rectTwo: " + rectTwo.origin.x);
        System.out.println("Y Position of rectTwo: " + rectTwo.origin.y);

	}

}
