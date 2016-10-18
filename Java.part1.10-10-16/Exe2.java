import java.util.Scanner;
public class Exe2 {


	public static void main(String [] args){
	   Scanner input = new Scanner(System.in);
	   System.out.println("enter number of 50:");
	   int e50 = input.nextInt();
	   System.out.println("enter number of 20:");
	   int e20 = input.nextInt();
	   System.out.println("enter number of 10:");
	   int e10 = input.nextInt();
	   System.out.println("enter number of 5:");
	   int e5 = input.nextInt();
	   System.out.println("enter number of 2:");
       int e2 = input.nextInt();
       System.out.println("enter number of 1:");
	   int e1 = input.nextInt();
	   int sum = 0;
	   sum = 50*e50 + 20*e20 + 10*e10 + 5*e5 + 2*e2 + e1;
	   System.out.println("The sum is " + sum + "euros");
	}

}