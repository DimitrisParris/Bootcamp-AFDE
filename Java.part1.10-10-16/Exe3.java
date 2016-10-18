import java.util.*;
public class Exe3{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in); // δημιουργώ αντικείμενο input της κλάσης Scanner , ώστε να μπορεί ο χρήστης να εισάγει από το πληκτρολόγιο
		System.out.println("Give me a:");
		double a = input.nextDouble();
		System.out.println("Give me b:");
		double b = input.nextDouble();
		System.out.println("Give me c:");
	  	double c = input.nextDouble();
	  	double d, e, f, g, A, uporizos;
	  	d = a+b+c;
	  	e = -a+b+c;
	  	f = -b+a+c;
	  	g = -c+b+a;
	  	uporizos = d*e*f*g;
	  	A = 0.25*(Math.sqrt(uporizos));
	  	System.out.println("Heron's formula, at this case, is " + A );

 }
}