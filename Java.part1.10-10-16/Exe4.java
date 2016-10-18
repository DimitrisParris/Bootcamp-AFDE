import java.util.*;
public class Exe4{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Give me a:");
		double a = input.nextDouble();
		System.out.println("Give me b:");
		double b = input.nextDouble();
		System.out.println("Give me c:");
	  	double c = input.nextDouble();
	  	double d;
	  	System.out.println(a+" "+b+" "+c);
	  	d = b*b - (4 *a *c);

	  	if (d < 0){
		    System.out.println("No solutions");
		}
		else if (d == 0){
		    System.out.println("double solution "+ (-b) / (2*a));
		}
		else {
   			System.out.println("Positive discreminateso x1="+ (-b + Math.sqrt(d))/(2*a)+ " and x2=" +(-b-Math.sqrt(d))/(2*a) );

		}




 }
}
