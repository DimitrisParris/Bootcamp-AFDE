import java.util.*;

public class Quotient {
	public static int calcQuotient(int numinator, int denominator) throws Exception {
		if (denominator == 0) {
			throw new ArithmeticException();
		}
		return numinator / denominator;
	}

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		boolean Ok = false;
		while(!Ok){
		try{
			System.out.println("Give me two integers (the first is the numinator and the second is the denominator) : ");
			int a = input.nextInt();
			int b = input.nextInt();
			int result = calcQuotient(a,b);
			System.out.println(result);
			Ok=true;
		}
		catch(ArithmeticException e){
			System.out.println("Division with zero!");
			input.nextLine();
			}
		catch(InputMismatchException e){
					System.out.println("You gave me a sting, not a number! Give me integer");
					input.nextLine();
			}
		}


	}

}
